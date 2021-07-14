package com.example.user.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.entity.User;
import com.example.user.feign.EmailFeignClient;
import com.example.user.repository.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	public EmailFeignClient emailFeignClient;
	public String createUser(User user) {
		User savedUser = userRepository.save(user);
		emailFeignClient.sendMail(user.getEmail());
//		System.out.println(response.getBody());
		return savedUser.getId();
	}
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	public Optional<User> getUser(String id) {
		return userRepository.findById(id);
	}
	public List<User> getUserByFirstName(String firstname) {

		return userRepository.findByFirstname(firstname);
	}
}
