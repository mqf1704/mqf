package com.bgs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.bgs.bean.User;
import com.bgs.dao.UserDao;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> findUserList() {
		// TODO Auto-generated method stub
		return userDao.findUserList();
	}
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDao.addUser(user);
	}
	public static void main(String[] args) {
		ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
		UserService us=app.getBean(UserService.class);
		/*List<User> uList=us.findUserList();
		for(User u:uList){
			System.out.println(u.getUsername());
		}*/
		//写操作
		User user=new User("mqf", "123456","男",18);
		int i=us.addUser(user);
		System.out.println(i);
	}
}
