package com.epam.quiz.service;

import java.util.List;
import java.util.Optional;

import com.epam.quiz.entity.Quiz;

public interface QuizService {
	
	public Quiz addQuiz(int noofquestions);
	
	public boolean removeQuiz(int id);
	
	public List<Quiz> getQuiz(int id);
	
	public List<Quiz> printQuizes();
	
	public void updateQuiz(int id, Quiz q2);
}
