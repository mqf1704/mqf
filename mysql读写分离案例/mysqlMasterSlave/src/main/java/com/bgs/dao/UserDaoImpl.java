package com.bgs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bgs.bean.User;
import com.bgs.mapper.UserMapper;
@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private UserMapper userMapper;
	@Override
	public List<User> findUserList() {
		// TODO Auto-generated method stub
		return userMapper.findUserList();
	}
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user);
	}

}
