package com.epam.quiz.entity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.persistence.*;

@Entity(name = "Question")
@Table(name = "question")
public class Question {
//    public static int generateId = 100;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "qid")
    private int id;

    @Column(name = "question")
    private String question;

    @ElementCollection
    @CollectionTable(name = "options")
    private Map<Integer,String> options = new HashMap<>();

    @Column(name = "answer")
    private int answer;


//    public Question(String question, Map<Integer, String> options, int answer) {
//        this.id = generateId++;
//        this.question = question;
//        this.options = options;
//        this.answer = answer;
//    }


    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Map<Integer, String> getOptions() {
        return options;
    }

    public int getAnswer() {
        return answer;
    }

//    public String getQuo(){
//        String q = "Question{" +
//                "Id=" + id +
//                ", Question='" + question + '\'' +"\n";
//        for(int i:options.keySet()){
//            q+="(" + i + ")" +options.get(i) + "\n";
//        }
//        q=q+
//                '}'+"\n"+
//                "------------------------------------";
//        return q;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(Map<Integer, String> options) {
        this.options = options;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "Id=" + id +
                ", Question='" + question + '\'' +
                ", Options=" + options +
                ", Answer=" + answer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question1 = (Question) o;
        return id == question1.id && answer == question1.answer && Objects.equals(question, question1.question) && Objects.equals(options, question1.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, question, options, answer);
    }
}
