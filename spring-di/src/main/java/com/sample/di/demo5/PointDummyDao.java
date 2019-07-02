package com.sample.di.demo5;

public class PointDummyDao implements PointDao {

	public void updatePoint(String id, int point) {
		System.out.println("아이디 : " + id + ", 포인트 : " + point);
		
	}
}
