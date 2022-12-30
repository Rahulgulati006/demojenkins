package com.epam.quiz.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.epam.quiz.entity.User;
import com.epam.quiz.springdatajpa.UserRepo;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	UserRepo userRepo;
	
	@Override
	public boolean checkUser(String usertype, String username, String password) {
        boolean result = false;
        User us = userRepo.findByUsertypeAndUsernameAndPassword(usertype, username, password);
        if(us!=null) {
        	result = true;
        }
        return result;
    }
	
	@Override
	public User addUser(String usertype, String username, String password){
        User user = new User();
        user.setUsertype(usertype);
        user.setUsername(username);
        user.setPassword(password);
//        em.persist(user);
        return userRepo.save(user);
    }
	
	@Override
	public List<User> getUser(){
//        List<User> users = null;
//        users = em.createQuery("select u from User u").getResultList();
        return (List<User>) userRepo.findAll();
    }
	
}
