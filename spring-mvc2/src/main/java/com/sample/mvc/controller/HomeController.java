package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sample.mvc.view.CustomExcelView;

@Controller
public class HomeController {

	@RequestMapping("/home.do")
	public String Home() {
		return "home";
	}
	
	@RequestMapping("/about.do")
	public ModelAndView about() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("about");
		
		return mav; 
	}
	
	@RequestMapping("history.do")
	public void history() {
	}
	
	@RequestMapping("/excel.do")
	public ModelAndView xls() {
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("제목", "2019년 상반기 매출현황");
		mav.addObject("매입", 100000000);
		mav.addObject("매출", 170000000);
		mav.addObject("영업이익", 70000000);
		mav.setView(new CustomExcelView());
		return mav;
	}
	
	@RequestMapping("/web.do")
	public ModelAndView web() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("title", "2019년 상반기 매출현황");
		mav.addObject("buy", 100000000);
		mav.addObject("sell", 170000000);
		mav.addObject("profit", 70000000);
		mav.setViewName("web");
		return mav;
	}
}
