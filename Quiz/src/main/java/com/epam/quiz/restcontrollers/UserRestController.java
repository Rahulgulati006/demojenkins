package com.epam.quiz.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.epam.quiz.dto.UserDTO;
import com.epam.quiz.entity.User;
import com.epam.quiz.service.UserServiceImpl;

public class UserRestController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	@GetMapping("users")
	public ResponseEntity<List<User>> getAllUsers() {
		return new ResponseEntity<List<User>>(userServiceImpl.readUser(), HttpStatus.ACCEPTED);
	}
	
	@PostMapping("addusers")
    public ResponseEntity<User> addUser(@RequestBody UserDTO userDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userServiceImpl.addUser(userDTO));
    }

}
