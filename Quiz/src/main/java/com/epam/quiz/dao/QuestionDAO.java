package com.epam.quiz.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.epam.quiz.entity.Question;

public interface QuestionDAO {
	
	public Question addQuestion(Question q);
	
	public List<Question> printQuestions();
	
	public boolean remQuestion(int id);
	
	public Question findQuestion(int id);
	
	public Question updateQuestion(int id, String ques);
	
	public boolean updateAnswer(int id, int answer);
	
	public boolean updateOptions(int id, Map<Integer, String> options);
}
