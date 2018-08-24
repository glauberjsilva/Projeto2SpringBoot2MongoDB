package com.glauber.projeto1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.glauber.projeto1.entity.User;

public interface UserRepository extends MongoRepository<User, Long> {

	User findByName(String nome);
	User findByEmail(String email);
	User findByNameIgnoreCase(String name);
}
