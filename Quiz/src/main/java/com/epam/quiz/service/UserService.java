package com.epam.quiz.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.epam.quiz.dto.UserDTO;
import com.epam.quiz.entity.User;

public interface UserService {
	
	public ModelAndView check(UserDTO userdto);
	
	public User addUser(UserDTO userdto);
	
	public List<User> readUser();
}
