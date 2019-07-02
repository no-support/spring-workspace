package com.sample.di.demo7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo7App {

	public static void main(String[] args) {
		
		String resource = "classpath:/com/sample/di/demo7/demo7.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		EmailService service = ctx.getBean("service", EmailService.class);
		service.connect();
	}
}
