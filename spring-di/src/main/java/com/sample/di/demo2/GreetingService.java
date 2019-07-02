package com.sample.di.demo2;

public class GreetingService {

	private KoreanGreeting ko;
	private EnglishGreeting eng;
	
	public void setKo(KoreanGreeting ko) {
		this.ko = ko;
	}
	
	public void setEng(EnglishGreeting eng) {
		this.eng = eng;
	}
	
	public String hello(String name) {
		String message = ko.message(name);
		return message;
	}
	
	public String bye() {
		String message = eng.goodbye();
		return message;
	}
}
