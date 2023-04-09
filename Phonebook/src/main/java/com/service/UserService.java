package com.service;

import com.dao.UserDao;
import com.entity.User;

public class UserService {

	UserDao usd = new UserDao();
	
	public boolean register(User u) {
		
		 return usd.userRegister(u);
	}

	public User login(String s, String p) {
		return usd.loginUser(s, p);
	}
}
