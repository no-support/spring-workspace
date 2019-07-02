package com.sample.di.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo5App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo5/demo5.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		UserService s1 = ctx.getBean("service", UserService.class);
		
		s1.addNewUser("홍길동", "전화번호", "아이디");
	}
}
