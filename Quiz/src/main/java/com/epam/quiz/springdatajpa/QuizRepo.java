package com.epam.quiz.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import com.epam.quiz.entity.Quiz;

public interface QuizRepo extends CrudRepository<Quiz, Integer>{

}
