package com.epam.quiz.entity;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Objects;
import javax.persistence.*;

@Table(name = "user")
@Entity(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userid;

    @Column(name = "user_type")
    private String usertype;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

//    public User(String usertype, String username, String password) {
//        this.usertype = usertype;
//        this.username = username;
//        this.password = password;
//    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "User Category='" + usertype + '\'' +
                ", Username='" + username + '\'' +
                ", Password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(usertype, user.usertype) && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usertype, username, password);
    }
}
