package com.springboot01.dao;

import java.util.List;

import com.springboot01.bean.User;

public interface UserDao {
	
	public boolean addUser(User user);
	
	public List<User> findAllUser();
	
	public List<User> findAllUserByName(String name);
	
	public boolean updateUser(User user);
	
	public boolean deleteUser(Integer id);
}
