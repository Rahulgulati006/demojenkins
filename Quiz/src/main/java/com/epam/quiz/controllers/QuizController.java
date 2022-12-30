package com.epam.quiz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.epam.quiz.service.QuestionServiceImpl;
import com.epam.quiz.service.QuizService;
import com.epam.quiz.service.QuizServiceImpl;

@Controller
public class QuizController {
	
	@Autowired
	QuizServiceImpl quizServiceImpl;
	
	@RequestMapping("createquizzes")
	public String createQuiz() {
		return "createquiz";
	}
	
	@RequestMapping("subcreatequiz")
	public ModelAndView subCreateQuiz(@RequestParam int noofquestions) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		quizServiceImpl.addQuiz(noofquestions);
		return mv;
	}
	
	@RequestMapping("readquizzes")
	public ModelAndView readQuizs() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("readquiz");
		mv.addObject("quizlist",quizServiceImpl.printQuizes());
		return mv;
	}
	
	@RequestMapping("findquizzes")
	public String findQuiz() {
		return "findquiz";
	}
	
	@RequestMapping("subfindquiz")
	public ModelAndView subFindQuiz(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("readquiz");
		mv.addObject("quizlist",quizServiceImpl.getQuiz(id));
		return mv;
	}
	
	@RequestMapping("deletequizzes")
	public String deleteQuiz() {
		return "deletequiz";
	}
	
	@RequestMapping("subdeletequiz")
	public ModelAndView subDeleteQuiz(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("readquiz");
		quizServiceImpl.removeQuiz(id);
		mv.addObject("quizlist",quizServiceImpl.getQuiz(id));
		return mv;
	}
	
	@RequestMapping("updatequizzes")
	public String updateQuiz() {
		return "updatequiz";
	}

}
