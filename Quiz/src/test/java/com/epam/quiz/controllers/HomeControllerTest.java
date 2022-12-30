package com.epam.quiz.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.epam.quiz.service.UserServiceImpl;

@ExtendWith(SpringExtension.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	UserServiceImpl userServiceImpl;
	
	@Test
	public void test1() throws Exception{
		mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(forwardedUrl("/jsp/login.jsp"));
	}
	
	@Test
	public void test2() throws Exception{
		mockMvc.perform(get("/signup")).andExpect(status().isOk()).andExpect(forwardedUrl("/jsp/signup.jsp"));
	}
}
