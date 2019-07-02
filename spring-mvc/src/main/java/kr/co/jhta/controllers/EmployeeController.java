package kr.co.jhta.controllers;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.jhta.dao.DepartmentDao;
import kr.co.jhta.dao.EmployeeDao;
import kr.co.jhta.form.EmployeeForm;
import kr.co.jhta.vo.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	/*
	 * @RequestMapping("/main.do") public String main(Model model) {
	 * 
	 * // 최근에 가입된 사원정보 조회 // 조회된 정보를 모델에 담아서 view페이지에 전달
	 * 
	 * return "emp/main"; }
	 * 
	 * @RequestMapping("/detail.do") public String detail(String id, int pno, Model
	 * model) { // System.out.println(id); // System.out.println(pno); //
	 * EmployeeDao dao = new EmployeeDao(); // Employee emp =
	 * dao.getEmployeeById(id); // model.addAttribute("employee", emp);
	 * 
	 * HashMap<String, Object> emp = new HashMap<String, Object>(); emp.put("id",
	 * id); emp.put("name", "홍길동"); emp.put("dept", "영업1팀");
	 * 
	 * model.addAttribute("employee", emp);
	 * 
	 * return "emp/detail"; }
	 * 
	 * @RequestMapping("/registerform.do") public String registerform() { return
	 * "emp/form"; }
	 * 
	 * @RequestMapping("/register.do") public String register(EmployeeForm emp) {
	 * System.out.println(emp);
	 * 
	 * return "redirect:main.do"; }
	 */
	

	@Autowired
	private DepartmentDao departmentDao;
	@Autowired
	private EmployeeDao employeeDao;
	
	// dept.do	employees.do?deptid=10 		employee.do?empid=101		form.do		add.do
	@RequestMapping("/dept.do")
	public String depts() {
		return "";
	}
	
	@RequestMapping("/employees.do")
	public String employees() {
		return "";
		
	}
	
	@RequestMapping("/form.do")
	public String form() {
		return "emp/form";
		
	}
	
	@RequestMapping("/add.do")
	public String add(Employee employee) {
		System.out.println(employee);
		
		employeeDao.addEmployee(employee);
		
		return "redirect:main.do";
		
	}
	
}
