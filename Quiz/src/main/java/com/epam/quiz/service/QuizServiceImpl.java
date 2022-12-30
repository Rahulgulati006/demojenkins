package com.epam.quiz.service;

import com.epam.quiz.dao.QuestionDAOImpl;
import com.epam.quiz.dao.QuizDAOImpl;
import com.epam.quiz.entity.Question;
import com.epam.quiz.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class QuizServiceImpl implements QuizService{
    
	@Autowired
    QuizDAOImpl quizDAOImpl;
	
	@Autowired
    QuestionDAOImpl questionDAOImpl;
	
	@Override
    public Quiz addQuiz(int noofquestions){
        List<Question> questionList = questionDAOImpl.printQuestions();
        Set<Question> list = questionList.stream().limit(noofquestions).collect(Collectors.toSet());
        Quiz quiz = new Quiz();
        quiz.setQuestions(list);
        return quizDAOImpl.addQuiz(quiz);
    }
	
	@Override
    public boolean removeQuiz(int id){
        return quizDAOImpl.removeQuiz(id);
    }
	
	@Override
    public List<Quiz> getQuiz(int id){
		List<Quiz> ls =new ArrayList<>();
    	ls.add(quizDAOImpl.getQuiz(id));
        return ls;
    }

	@Override
    public List<Quiz> printQuizes(){
        return quizDAOImpl.printQuizes();
    }
	
	@Override
    public void updateQuiz(int id, Quiz q2){
    	quizDAOImpl.updateQuiz(id, q2);
    }
}
