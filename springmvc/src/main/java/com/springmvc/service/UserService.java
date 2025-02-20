package com.springmvc.service;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.springmvc.dao.UserDao;
import com.springmvc.model.User;


//import jakarta.transaction.Transactional;

//import jakarta.transaction.Transactional;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int createUserDao(User user) {
		return this.userDao.saveUser(user);
	}

}
