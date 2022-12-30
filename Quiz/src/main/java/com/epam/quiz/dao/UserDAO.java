package com.epam.quiz.dao;

import java.util.List;

import com.epam.quiz.entity.User;

public interface UserDAO {
	
	public boolean checkUser(String usertype, String username, String password);
	
	public User addUser(String usertype, String username, String password);
	
	public List<User> getUser();
}
