package com.ReactMongo.crudOperation.service;

import java.util.List;

import com.ReactMongo.crudOperation.model.User;

public interface UserService {
	User create(User user);
	User getUser(String id);
	List<User> getUser();
	User updateUser(String userId, User updatedUser);
	void deleteUser(String userId);
	
	
}
