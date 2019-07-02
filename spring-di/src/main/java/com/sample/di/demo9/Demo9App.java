package com.sample.di.demo9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo9App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo9/demo9.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		MailConnectService service = ctx.getBean(MailConnectService.class);
		service.connect();
	}
}
