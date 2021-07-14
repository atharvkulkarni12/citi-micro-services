package com.example.user.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.user.entity.User;

public interface UserRepository extends MongoRepository<User, String>{
	public List<User> findByFirstname(String firstname);
}
