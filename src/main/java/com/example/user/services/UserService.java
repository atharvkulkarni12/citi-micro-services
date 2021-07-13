package com.example.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RestTemplate restTemplate;
	public String createUser(User user) {
		User savedUser = userRepository.save(user);
		String request = "pariweshg@gmail.com";
		ResponseEntity<String> response = restTemplate.postForEntity(
				"http://localhost:8081/email", 
				request , String.class);
		System.out.println(response.getBody());
		return savedUser.getId();
	}
}
