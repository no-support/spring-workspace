package com.sample.di.demo8;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

	public void deleteAllUsers() {
		System.out.println("모든 사용자 삭제");
	}
	
	public String getPassword(String id) {
		System.out.println("비밀번호 조회");
		return "zxcv1234";
	}
}
