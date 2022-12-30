package com.epam.quiz.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.epam.quiz.dto.QuestionDTO;
import com.epam.quiz.entity.Question;

public interface QuestionService {
	
	public Question addQuestion(QuestionDTO q);
	
	public boolean remQuestion(int id);
	
	public List<Question> findQuestion(int id);
	
	public List<Question> printQuestions();
	
	public void updateQuestion(String question);
	
	public void updateAnswer(QuestionDTO q);
	
	public void updateOptions(QuestionDTO q);

}
