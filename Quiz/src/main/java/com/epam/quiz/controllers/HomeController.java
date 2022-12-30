package com.epam.quiz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.epam.quiz.dto.UserDTO;
import com.epam.quiz.service.UserServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@RequestMapping("/")
	public String home() {
		return "login";
	}
	@RequestMapping("signup")
	public String signup() {
		return "signup";
	}
	@RequestMapping("authenticate")
	public ModelAndView login(UserDTO userdto){
		ModelAndView mv = userServiceImpl.check(userdto);
		return mv;
	}
	@RequestMapping("createuser")
	public ModelAndView adduser(UserDTO userdto){
		ModelAndView mv = new ModelAndView();
		userdto.setUsertype(userdto.getUsertype().toUpperCase());
		userServiceImpl.addUser(userdto);
		mv.setViewName("useradded");
		return mv;
	}
}
