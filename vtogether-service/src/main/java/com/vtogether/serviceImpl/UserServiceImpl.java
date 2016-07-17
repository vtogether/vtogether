package com.vtogether.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.vtogether.dao.UserDao;
import com.vtogether.domain.User;
import com.vtogether.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	public List<User> getAllUsers() {
		return userDao.selectAllUsers();
	}

}
