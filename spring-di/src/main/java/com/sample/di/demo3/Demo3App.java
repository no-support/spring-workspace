package com.sample.di.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo3App {

	public static void main(String[] args) {
		String resource = "classpath:/com/sample/di/demo3/demo3.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);		// 스프링 컨테이너 인터페이스 ctx = 실제 구현체()
		
		SampleController controller = ctx.getBean("controller", SampleController.class);
		
		controller.add("아이디", "비밀번호");
	}
}
