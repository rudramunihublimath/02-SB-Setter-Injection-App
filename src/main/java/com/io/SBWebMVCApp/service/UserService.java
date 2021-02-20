package com.io.SBWebMVCApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.SBWebMVCApp.dao.UserDao;

@Service
public class UserService {
	public UserService() {
		System.out.println("UserService Constructor..");
	}

	private UserDao dao;
	
	@Autowired
	public void setDao(UserDao dao) {
		System.out.println("setter method called ..");
		this.dao = dao;
	}


	public void printUserName(Integer id) {
		String name = dao.findByNameById(id);
		System.out.println(name);		
	}
}
