package com.springboot01.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.mongodb.WriteResult;
import com.springboot01.bean.User;


@Repository("userDao")
public class UserDaoImpl implements UserDao{

	@Autowired
	private MongoTemplate mt;
	
	@Override
	public boolean addUser(User user) {
		mt.insert(user);
		return true;
	}

	@Override
	public List<User> findAllUser() {
		List<User> user = mt.findAll(User.class);
		return user;
	}
	
	

	@Override
	public boolean updateUser(User user) {
		Update update = new Update();
		update.set("age", 22);
		WriteResult first = mt.updateFirst(new Query(Criteria.where("name").is("胡图图")), update, User.class);
		if(first!=null){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public List<User> findAllUserByName(String name) {
		Query query = new Query();
		query.addCriteria(Criteria.where("name").is(name));
		List<User> user = mt.find(query, User.class);
		return user;
	}

	@Override
	public boolean deleteUser(Integer id) {
		User user = mt.findById(1, User.class);
		WriteResult remove = mt.remove(user);
		if(remove!=null){
			return true;
		}
		else{
			return false;
		}
	}

}
