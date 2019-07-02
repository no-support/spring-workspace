package com.sample.di.demo8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
	@Autowired
	private UserDao userDao;
	
	public void login(String id, String pwd) {
		String dbPassword = userDao.getPassword(id);
		System.out.println("가입 시 비밀번호: " + dbPassword);
		
		if (pwd.equals(dbPassword)) {
			System.out.println("비밀번호가 일치합니다.");
			
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
	}
}
