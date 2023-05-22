package com.ReactMongo.crudOperation.repository;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.ReactMongo.crudOperation.model.User;



public interface UserRepository extends MongoRepository<User, String>{
	
	//custom findout methods
	
	 Optional findByUserId(String userId);
	
}
