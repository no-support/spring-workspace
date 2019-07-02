package com.sample.di.demo6;

public class MessageService {

	private Goodmorning morning;
	private Goodbye bye;
	
	public void setMorning(Goodmorning morning) {
		this.morning = morning;
	}
	
	public void setBye(Goodbye bye) {
		this.bye = bye;
	}
	
	public MessageService() {
		
	}
	
	public MessageService(Goodmorning morning, Goodbye bye) {
		this.morning = morning;
		this.bye = bye;
	}
	
	public void say() {
		morning.sayHello();
		bye.sayBye();
	}
}
