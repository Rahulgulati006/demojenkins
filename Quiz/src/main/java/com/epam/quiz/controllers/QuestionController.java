package com.epam.quiz.controllers;

import java.net.http.HttpRequest;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.epam.quiz.dto.QuestionDTO;
import com.epam.quiz.entity.Question;
import com.epam.quiz.service.QuestionServiceImpl;

@Controller
public class QuestionController {
	
	private static Logger logger = LogManager.getLogger();
	
	@Autowired
	QuestionServiceImpl questionServiceImpl;
	
	@RequestMapping("createques")
	public String createQuestion() {
		return "createquestion";
	}
	
	@RequestMapping("subcreateques")
	public ModelAndView submitCreateQuestion(QuestionDTO questionDTO) {
		ModelAndView mv = new ModelAndView();
		logger.info(questionDTO);
		questionServiceImpl.addQuestion(questionDTO);
		mv.setViewName("success");
		return mv;
	}
	
	@RequestMapping("readques")
	public ModelAndView readQuestions() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("readquestion");
		questionServiceImpl.printQuestions().stream().forEach(logger::info);
		mv.addObject("questionlist",questionServiceImpl.printQuestions());
		return mv;
	}
	
	@RequestMapping("findques")
	public String findQuestion() {
		return "findquestion";
	}
	
	@RequestMapping("subfindques")
	public ModelAndView subFindQuestion(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("readquestion");
		mv.addObject("questionlist",questionServiceImpl.findQuestion(id));
		return mv;
	}
	
	@RequestMapping("deleteques")
	public String deleteQuestion() {
		return "deletequestion";
	}
	
	@RequestMapping("subdeleteques")
	public ModelAndView subDeleteQuestion(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("readquestion");
		questionServiceImpl.remQuestion(id);
		mv.addObject("questionlist",questionServiceImpl.printQuestions());
		return mv;
	}
	
	@RequestMapping("updateques")
	public String updateQuestion() {
		return "updatequestion";
	}
	
	@RequestMapping("updatefindques")
	public ModelAndView updateFindQuestion(@RequestParam int id) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updatequestion");
		//questionServiceImpl.printQuestions().stream().forEach(logger::info);
		mv.addObject("questionlist",questionServiceImpl.findQuestion(id));
		return mv;
	}
	
	@RequestMapping("updatequestion1")
	public String updateQuestion1(@RequestParam String question) {
		logger.info(question);
		questionServiceImpl.updateQuestion(question);
		return "success";
	}

	@RequestMapping("updateanswer")
	public String updateAnswer(QuestionDTO q) {
		logger.info(q);
		questionServiceImpl.updateAnswer(q);
		return "success";
	}

	@RequestMapping("updateoptions")
	public String updateOptions(QuestionDTO q) {
		logger.info(q);
		questionServiceImpl.updateOptions(q);
		return "success";
	}

}
