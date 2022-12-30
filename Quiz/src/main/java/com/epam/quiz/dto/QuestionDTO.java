package com.epam.quiz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

public class QuestionDTO {
	@Size(min=4,max=100,message="Question length should be between 4 and 100")
	@NotBlank(message = "Field cannot be blank")
	private String question;
	@NotBlank(message = "Field cannot be blank")
	private String option1;
	@NotBlank(message = "Field cannot be blank")
	private String option2;
	@NotBlank(message = "Field cannot be blank")
	private String option3;
	@NotBlank(message = "Field cannot be blank")
	private String option4;
	@Min(value = 1,message ="answer should be greater than 1")
	@Max(value = 4,message = "answer should be less than 4")
	private int answer;
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "QuestionDTO [question=" + question + ", option1=" + option1 + ", option2=" + option2
				+ ", option3=" + option3 + ", option4=" + option4 + ", answer=" + answer + "]";
	}
	
	
	
}
