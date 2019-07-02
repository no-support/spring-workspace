package com.sample.di.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo8App {
	
	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo8/demo8.xml";
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource); // 스프링 컨테이너. 생성과 조립을 담당함.
		
		LoginService service1 = ctx.getBean("loginService", LoginService.class); 
		service1.login("hong", "1111-1111");
	}
}
