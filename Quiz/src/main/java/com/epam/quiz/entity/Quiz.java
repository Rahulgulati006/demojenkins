package com.epam.quiz.entity;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Table(name = "quiz")
@Entity(name = "Quiz")
public class Quiz {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quizid")
    int quizId;

    @ManyToMany(fetch = FetchType.EAGER,cascade = { 
            CascadeType.ALL
    })
    @JoinTable(name = "quiz_question",joinColumns = {@JoinColumn(name = "quizid")},inverseJoinColumns = {@JoinColumn(name = "qid")})
    Set<Question> questions;

    public Quiz(){}

    public int getQuizId() {
        return quizId;
    }

    public void setQuizId(int quizId) {
        this.quizId = quizId;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "QuizId=" + quizId +
                ", Questions=" + questions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quiz quiz = (Quiz) o;
        return quizId == quiz.quizId && Objects.equals(questions, quiz.questions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quizId, questions);
    }
}
