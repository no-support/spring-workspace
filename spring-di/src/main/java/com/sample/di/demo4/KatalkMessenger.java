package com.sample.di.demo4;

public class KatalkMessenger implements Messenger {
	
	public String receivedMessage() {
		System.out.println("카톡으로 메시지 수신하기");
		return "깨톡: 반갑습니다";
	}
	
	public void sendMessage(String to, String text) {
		System.out.println("카톡으로 메시지 보내기");
		System.out.println("받는 사람 : " + to);
		System.out.println("메시지 내용 : " + text);
	}
}
