package com.epam.quiz.service;

import com.epam.quiz.dao.UserDAOImpl;
import com.epam.quiz.dto.UserDTO;
import com.epam.quiz.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAOImpl userDAOImpl;
    
    @Override
    public ModelAndView check(UserDTO userdto){
        ModelAndView mv = new ModelAndView();
//		logger.info(userdto.getUsertype()+" "+userdto.getUsername()+" "+userdto.getPassword());
		if(userDAOImpl.checkUser(userdto.getUsertype(),userdto.getUsername(),userdto.getPassword())){
			if(userdto.getUsertype().equalsIgnoreCase("ADMIN")) {
				mv.setViewName("adminportal");
			}
			else {
				mv.setViewName("userportal");
			}
		}
		else {
			mv.setViewName("authfail");
		}
		return mv;
    }
    
    @Override
    public User addUser(UserDTO userdto){
    	return userDAOImpl.addUser(userdto.getUsertype(),userdto.getUsername(),userdto.getPassword());
    }
    
    @Override
    public List<User> readUser(){
        return userDAOImpl.getUser();
    }
}
