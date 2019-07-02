package com.sample.di.demo5;

public class UserDummyDao implements UserDao {

	public void insertUser(String name, String tel) {
		System.out.println("이름 : " + name + ", 전화번호 : " + tel);
		
	}
}
