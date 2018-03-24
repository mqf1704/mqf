package com.bgs.service;

import java.util.List;

import com.bgs.bean.User;

public interface UserService {
	List<User> findUserList();
	int addUser(User user);
}
