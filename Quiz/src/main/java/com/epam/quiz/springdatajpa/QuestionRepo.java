package com.epam.quiz.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import com.epam.quiz.entity.Question;

public interface QuestionRepo extends CrudRepository<Question, Integer>{

}
