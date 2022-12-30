package com.epam.quiz.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.epam.quiz.entity.Question;
import com.epam.quiz.springdatajpa.QuestionRepo;

@Repository
public class QuestionDAOImpl implements QuestionDAO{
	
	@Autowired
	QuestionRepo questionRepo;
	
	@Override
	public Question addQuestion(Question q){
//           em.persist(q);
		return questionRepo.save(q);
    }
	
	@Override
	public List<Question> printQuestions(){
        List<Question> questionList = null;
//        questionList = em.createQuery("select q from Question q").getResultList();
        return (List<Question>) questionRepo.findAll();
    }
	
	@Override
	@Transactional
	public boolean remQuestion(int id){
        Question question = null;
        boolean result = false;
//        question = em.find(Question.class,id);
        Optional<Question> op = questionRepo.findById(id);
        question = op.get();
        if(question!=null){
            questionRepo.delete(question);
            result = true;
        }
        return result;
    }
	
	@Override
	public Question findQuestion(int id){
//        Question question = em.find(Question.class,id);
//        System.out.println(question);
		Optional<Question> op = questionRepo.findById(id);
		return op.get();
    }
	
	@Override
	@Transactional
	public Question updateQuestion(int id, String ques) {
        Question question = null;
        Optional<Question> op = questionRepo.findById(id);
        if (op.isPresent()) {
        	question = op.get();
            question.setQuestion(ques);
            question = questionRepo.save(question);
        }
        return question;
    }
	
	@Override
	@Transactional
    public boolean updateAnswer(int id, int answer) {
        boolean result = false;
//        Question question = em.find(Question.class,id);
        Optional<Question> op = questionRepo.findById(id);
        Question question = op.get();
        if(question!=null){
            question.setAnswer(answer);
//            em.persist(question);
            questionRepo.save(question);
            result = true;
        }
        return result;
    }
	
	@Override
	@Transactional
    public boolean updateOptions(int id, Map<Integer, String> options) {
        boolean result = false;
//        Question question = em.find(Question.class,id);
        Optional<Question> op = questionRepo.findById(id);
        Question question = op.get();
        if(question!=null){
            question.setOptions(options);
//            em.persist(question);
            questionRepo.save(question);
            result = true;
        }
        return result;
    }
}
