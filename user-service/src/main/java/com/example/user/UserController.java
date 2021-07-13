package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.services.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	String processGet() {
		System.out.println("called");
		return "Hello";
	}
	
	@PostMapping("/user")
	String createUser(@RequestBody User user) {
		System.out.println(user.getFirstname());
		return userService.createUser(user);
	}
}
