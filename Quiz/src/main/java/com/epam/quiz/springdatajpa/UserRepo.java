package com.epam.quiz.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import com.epam.quiz.entity.User;

public interface UserRepo extends CrudRepository<User, Integer>{
	public User findByUsertypeAndUsernameAndPassword(String usertype, String username, String password);
}
