package com.epam.quiz.exceptions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class RestControllerExceptionHandler {
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ExceptionResponse> handleMethodArgumentNotValid(MethodArgumentNotValidException e, WebRequest req) {
		List<String> inputerrors = new ArrayList<>();
		e.getAllErrors().forEach(err->{
			inputerrors.add(err.getDefaultMessage());
		});
		ExceptionResponse error = new ExceptionResponse(new Date().toString(),HttpStatus.BAD_REQUEST.name(), inputerrors.toString() , req.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(error,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(TaskNotFoundException.class)
	public ResponseEntity<ExceptionResponse> taskNotFoundException(TaskNotFoundException e, WebRequest req){
		ExceptionResponse error = new ExceptionResponse(new Date().toString(),HttpStatus.NOT_FOUND.name(), e.getMessage(), req.getDescription(false));
		return new ResponseEntity<ExceptionResponse>(error,HttpStatus.NOT_FOUND);
	}
}
