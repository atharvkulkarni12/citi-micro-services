package com.example.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	List<User> processGet() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/user/{id}")
	Optional<User> getOne(@PathVariable("id") String id) {
		return userService.getUser(id);
	}
	
	@GetMapping("/user/firstname/{firstname}")
	List<User> getByFirstName(@PathVariable("firstname") String firstname) {
		return userService.getUserByFirstName(firstname);
	}
	@PostMapping("/user")
	String createUser(@RequestBody User user) {
		System.out.println(user.getFirstname());
		return userService.createUser(user);
	}
}
