package com.bgs.mapper;

import java.util.List;

import com.bgs.bean.User;

/**
 * 
 * @author 孟庆丰
 *@Date 2018年3月24日 下午5:51:27
 */
public interface UserMapper {
	//查询操作
	List<User> findUserList();
	//添加操作
	int addUser(User user);
}
