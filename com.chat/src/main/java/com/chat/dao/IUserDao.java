package com.chat.dao;

import java.util.List;

import com.chat.doman.User;

public interface IUserDao {

	public boolean creatUser(User user);
	public User findUser(String userId);
	public boolean updateUser(String userId);
	public boolean deleteUser(String userId);
	public List<User> getAllUser();
}
