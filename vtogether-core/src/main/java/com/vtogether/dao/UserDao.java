package com.vtogether.dao;


import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vtogether.domain.User;

@Repository
@Transactional
public interface UserDao {
	
	public List<User> selectAllUsers();
}
