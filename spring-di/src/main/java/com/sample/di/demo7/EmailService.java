package com.sample.di.demo7;

public class EmailService {
	
	private String host;
	private int port;
	private String userId;
	private String userpwd;
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	
	public void connect() {
		System.out.println("메일 서버 연결");
		System.out.println("호스트: " + host);
		System.out.println("포트번호: " + port);
		System.out.println("아이디: " + userId);
		System.out.println("비밀번호: " + userpwd);
	}
}