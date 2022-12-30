package com.epam.quiz.service;

import com.epam.quiz.dao.*;
import com.epam.quiz.dto.QuestionDTO;
import com.epam.quiz.entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService{
    @Autowired
    QuestionDAOImpl questionDAOImpl;
    
    private int id;
    
    @Override
    public Question addQuestion(QuestionDTO q){
    	Question question = new Question();
    	question.setQuestion(q.getQuestion());
    	question.setAnswer(q.getAnswer());
    	HashMap<Integer,String> options = new HashMap<>();
    	options.put(1,q.getOption1());
    	options.put(2,q.getOption2());
    	options.put(3,q.getOption3());
    	options.put(4,q.getOption4());
    	question.setOptions(options);
    	return questionDAOImpl.addQuestion(question);
    }

    @Override
    public boolean remQuestion(int id){
        return questionDAOImpl.remQuestion(id);
    }

    @Override
    public List<Question> findQuestion(int id){
    	List<Question> ls =new ArrayList<>();
    	ls.add(questionDAOImpl.findQuestion(id));
    	setId(id);
        return ls;
    }

    @Override
    public List<Question> printQuestions(){
        return questionDAOImpl.printQuestions();
    }

    @Override
    public void updateQuestion(String question){
    	int id = getId();
    	questionDAOImpl.updateQuestion(id,question);
    }

    @Override
    public void updateAnswer(QuestionDTO q){
    	int id = getId();
    	int answer = q.getAnswer();
        questionDAOImpl.updateAnswer(id,answer);
    }

    @Override
    public void updateOptions(QuestionDTO q){
    	int id = getId();
    	Map<Integer,String> options = new HashMap<>();
    	options.put(1, q.getOption1());
    	options.put(2, q.getOption2());
    	options.put(3, q.getOption3());
    	options.put(4, q.getOption4());
        questionDAOImpl.updateOptions(id,options);
    }
    
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id=id;
    }
}
