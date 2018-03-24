package com.bgs.dao;

import java.util.List;

import com.bgs.bean.User;

public interface UserDao {
	List<User> findUserList();
	int addUser(User user);
}
