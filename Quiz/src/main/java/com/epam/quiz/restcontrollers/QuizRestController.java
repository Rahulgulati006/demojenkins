package com.epam.quiz.restcontrollers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.epam.quiz.dto.QuestionDTO;
import com.epam.quiz.entity.Question;
import com.epam.quiz.entity.Quiz;
import com.epam.quiz.service.QuestionServiceImpl;
import com.epam.quiz.service.QuizServiceImpl;

public class QuizRestController {
	
	@Autowired
	QuizServiceImpl questionServiceImpl;
	
	@GetMapping("quizzes")
	public ResponseEntity<List<Quiz>> getAllQuiz() {
		return new ResponseEntity<List<Quiz>>(questionServiceImpl.printQuizes(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{quizId}")
    public ResponseEntity<List<Quiz>> getQuizById(@PathVariable @Valid @Size(min=1,max=20,message="id should be between 1 nd 20") int quizId) {
        return ResponseEntity.status(HttpStatus.OK).body(questionServiceImpl.getQuiz(quizId));
    }
	
	@PostMapping("addquiz")
    public ResponseEntity<Quiz> addQuiz(@PathVariable int noofquestions) {
        return ResponseEntity.status(HttpStatus.CREATED).body(questionServiceImpl.addQuiz(noofquestions));
    }

    @DeleteMapping("/{quizId}")
    public ResponseEntity<QuestionDTO> removeQuestion(@PathVariable  @Valid @Max(value=7,message="id should not be greater than 7") int quizId) {
    	questionServiceImpl.removeQuiz(quizId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
