package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao = new UserDao();

	public int createUser(User user) {
		return userDao.saveUser(user);

	}

}
