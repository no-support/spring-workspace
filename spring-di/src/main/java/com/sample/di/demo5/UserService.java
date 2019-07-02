package com.sample.di.demo5;

public class UserService {

	private UserDao userDao;
	private PointDao pointDao;
	
	public void setUser(UserDao user) {
		this.userDao = user;
	}
	
	public void setPoint(PointDao point) {
		this.pointDao = point;
	}
	
	void addNewUser(String name, String tel, String id) {
		userDao.insertUser(name, tel);
		pointDao.updatePoint(id, 10);
	}
}
