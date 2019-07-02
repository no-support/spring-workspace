package com.sample.di.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo2App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo2/demo2.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);
		
		GreetingService service = ctx.getBean("service", GreetingService.class);
		String message = service.hello("홍길동");
		System.out.println(message);
		
		String message2 = service.bye();
		System.out.println(message2);
	}
}
