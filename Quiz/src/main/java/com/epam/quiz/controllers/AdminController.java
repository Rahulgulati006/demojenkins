package com.epam.quiz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping("question")
	public String question() {
		return "questionportal";
	}
	@RequestMapping("quiz")
	public String quiz() {
		return "quizportal";
	}
	@RequestMapping("admin")
	public String admin() {
		return "adminportal";
	}
}
