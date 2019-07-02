package com.sample.di.demo4;

public interface Messenger {
	
	void sendMessage(String to, String text);
	String receivedMessage();
}