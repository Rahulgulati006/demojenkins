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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.epam.quiz.dto.QuestionDTO;
import com.epam.quiz.entity.Question;
import com.epam.quiz.service.QuestionServiceImpl;

@RestController
public class QuestionRestController {
	
	@Autowired
	QuestionServiceImpl questionServiceImpl;
	
	@GetMapping("questions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return new ResponseEntity<List<Question>>(questionServiceImpl.printQuestions(), HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{questionId}")
    public ResponseEntity<List<Question>> getQuestionById(@PathVariable @Valid @Size(min=1,max=20,message="id should be between 1 nd 20") int questionId) {
        return ResponseEntity.status(HttpStatus.OK).body(questionServiceImpl.findQuestion(questionId));
    }
	
	@PostMapping("addquestions")
    public ResponseEntity<Question> addQuestion(@RequestBody @Valid QuestionDTO questionDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(questionServiceImpl.addQuestion(questionDTO));
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<QuestionDTO> removeQuestion(@PathVariable  @Valid @Max(value=7,message="id should not be greater than 7") int questionId) {
    	questionServiceImpl.remQuestion(questionId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
	
}
	
