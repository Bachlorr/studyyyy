package com.springboot01.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot01.bean.ResultBean;
import com.springboot01.bean.User;
import com.springboot01.dao.UserDao;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserDao userDao;
	
	@RequestMapping("/add")
	@ResponseBody
	public ResultBean userAdd(@RequestBody User user){
		boolean addUser = userDao.addUser(user);
		if(addUser)
		{
			return new ResultBean(ResultBean.STATA_SUCCESS, "添加成功");
		}
		else{
			return new ResultBean(ResultBean.STATA_FIAIL, "添加失败");
		}

	}
	
	@RequestMapping("/findAll")
	@ResponseBody
	public ResultBean findAll(){
		List<User> findAllUser = userDao.findAllUser();
		System.out.println(findAllUser);
		
		ResultBean resultBean = new ResultBean(ResultBean.STATA_SUCCESS, "查询成功", findAllUser);
		return resultBean;
	}
	
	@RequestMapping("/findByName")
	@ResponseBody
	public ResultBean findByName(@RequestBody String name){
		List<User> list = userDao.findAllUserByName(name);
		
		ResultBean resultBean = new ResultBean(ResultBean.STATA_SUCCESS, "查询成功", list);
		return resultBean;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public ResultBean Update(@RequestBody User user){
		boolean updateUser = userDao.updateUser(user);
		if(updateUser)
		{
			return new ResultBean(ResultBean.STATA_SUCCESS, "添加成功");
		}
		else{
			return new ResultBean(ResultBean.STATA_FIAIL, "添加失败");
		}

	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public ResultBean deleteUser(@RequestBody Integer id){
		boolean deleteUser = userDao.deleteUser(id);
		if(deleteUser)
		{
			return new ResultBean(ResultBean.STATA_SUCCESS, "添加成功");
		}
		else{
			return new ResultBean(ResultBean.STATA_FIAIL, "添加失败");
		}
	}
	
	
}
