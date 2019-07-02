package com.sample.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController {

	@RequestMapping("/list.do")
	public String list(@RequestParam(value = "pno", required = false, defaultValue = "1") int pno) {
		System.out.println("pno : " + pno);
		return "list";
	}
	
	@RequestMapping(value = "/register.do", method = RequestMethod.GET)
	public String form() {
		return "registerform";
		
	}
	
	@RequestMapping(value = "/register.do", method = RequestMethod.POST)
	public String register(String name, String id, String password, String email) {
		System.out.println("이름 : " + name);
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("이메일 : " + email);
		
		return "redirect:list.do";
	}
}
