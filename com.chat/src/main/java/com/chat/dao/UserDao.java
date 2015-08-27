package com.chat.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chat.doman.User;

@Repository
public class UserDao implements IUserDao{
 
	@Autowired
   private EntityManager em;
	
	@Override
	public boolean creatUser(User user) {
		em.persist(user);
		return true;
	}

	@Override
	public User findUser(String userId) {
		
		Query q=em.createQuery("FROM User u Where u.userId=:id");
		q.setParameter("id", userId);
		return (User)q.getSingleResult();
	}

	@Override
	public boolean updateUser(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
