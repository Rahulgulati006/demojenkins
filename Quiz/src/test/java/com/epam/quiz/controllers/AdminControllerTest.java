package com.epam.quiz.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@WebMvcTest(AdminController.class)
public class AdminControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Test
	public void test1() throws Exception{
		mockMvc.perform(get("/question")).andExpect(status().isOk()).andExpect(forwardedUrl("/jsp/questionportal.jsp"));
	}
	
	@Test
	public void test2() throws Exception{
		mockMvc.perform(get("/quiz")).andExpect(status().isOk()).andExpect(forwardedUrl("/jsp/quizportal.jsp"));
	}
	
	@Test
	public void test3() throws Exception{
		mockMvc.perform(get("/admin")).andExpect(status().isOk()).andExpect(forwardedUrl("/jsp/adminportal.jsp"));
	}

}
