package com.bgs.bean;
/**
 * 
 * @author 孟庆丰
 *@Date 2018年3月24日 下午5:47:19
 */
public class User {
	private int id;
	private String username;
	private String password;
	private String sex;
	private int age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String sex, int age) {
		super();
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
