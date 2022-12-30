package com.epam.quiz.dao;

import java.util.List;

import com.epam.quiz.entity.Quiz;

public interface QuizDAO {
	
	public Quiz addQuiz(Quiz quiz);
	
	public boolean removeQuiz(int id);
	
	public Quiz getQuiz(int id);
	
	public List<Quiz> printQuizes();
	
	public boolean updateQuiz(int id, Quiz q2);
}
