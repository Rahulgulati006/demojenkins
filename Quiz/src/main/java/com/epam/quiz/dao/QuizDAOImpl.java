package com.epam.quiz.dao;

import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.quiz.entity.Question;
import com.epam.quiz.entity.Quiz;
import com.epam.quiz.springdatajpa.QuestionRepo;
import com.epam.quiz.springdatajpa.QuizRepo;

@Repository
public class QuizDAOImpl implements QuizDAO {
	
	@Autowired
	QuizRepo quizRepo;
	
	@Autowired
	QuestionRepo questionRepo;
	
	public Quiz addQuiz(Quiz quiz){
		return quizRepo.save(quiz);
    }
	
	public boolean removeQuiz(int id){
        Quiz quiz = null;
        boolean result = false;
//        quiz = em.find(Quiz.class,id);
        Optional<Quiz> op = quizRepo.findById(id);
        quiz = op.get();
        if(quiz != null){
//            em.remove(em.merge(quiz));
        	quizRepo.delete(quiz);
            result = true;
        }
        return result;
    }
	
	public Quiz getQuiz(int id){
//        Quiz quiz = em.find(Quiz.class,id);
//        return quiz;
		Optional<Quiz> op = quizRepo.findById(id);
		return op.get();
    }
	
	public List<Quiz> printQuizes(){
//        List<Quiz> quizList = em.createQuery("select q from Quiz q").getResultList();
//        System.out.println(quizList);
        return (List<Quiz>) quizRepo.findAll();
    }
	
	public boolean updateQuiz(int id, Quiz q2){
        boolean result = false;
        Quiz quiz = null;
//        quiz = em.find(Quiz.class, id);
        Optional<Quiz> op = quizRepo.findById(id);
		quiz = op.get();
        if (quiz != null) {
            quiz=q2;
//            em.persist(quiz);
            quizRepo.save(quiz);
            result = true;
        }
        return result;
    }
}
