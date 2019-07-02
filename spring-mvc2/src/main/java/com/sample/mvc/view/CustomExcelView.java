package com.sample.mvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class CustomExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// 모델에 저장된 값 가져오기
		String title = (String) model.get("제목");
		int buy = (Integer) model.get("매입");
		int sell = (Integer) model.get("매출");
		int profit = (Integer) model.get("영업이익");
		
		// 새로운 엑셀sheet를 생성한다.
		HSSFSheet sheet = workbook.createSheet("sample sheet");
		// 엑셀시트에 새로운 행을 생성한다.
		HSSFRow row = sheet.createRow(0);
		// 생성된 행의 새로운 칸을 생성하고, 값을 설정한다.
		row.createCell(0).setCellValue(title);
		
		HSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("총매입금액");
		row1.createCell(1).setCellValue(buy);
		
		HSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("총매출금액");
		row2.createCell(1).setCellValue(sell);
		
		HSSFRow row3 = sheet.createRow(3);
		row3.createCell(0).setCellValue("총영업이익");
		row3.createCell(1).setCellValue(profit);
		
		// 파일이 다운로드되는  경우의 응답컨텐츠 타입 설정하기
		response.setContentType("application/octet-stream");
		// 다운로드되는 첨부파일의 이름을 설정하기
		response.setHeader("Content-Disposition", "attachment; filename=sample.xls");
	}
}
