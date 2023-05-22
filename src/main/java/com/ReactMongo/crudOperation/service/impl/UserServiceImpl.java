package com.ReactMongo.crudOperation.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactMongo.crudOperation.model.User;
import com.ReactMongo.crudOperation.repository.UserRepository;
import com.ReactMongo.crudOperation.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User getUser(String id) {
        return (User) userRepository.findByUserId(id).orElse(null);
    }
	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	 @Override
	    public User updateUser(String userId, User updatedUser) {
	        User existingUser = (User) userRepository.findByUserId(userId).orElse(null);
	        if (existingUser != null) {
	            // Update the existing user with the new data
	            existingUser.setName(updatedUser.getName());
	            existingUser.setEmail(updatedUser.getEmail());
	            existingUser.setMobile(updatedUser.getMobile());
	            // ... update other fields as needed

	            // Save the updated user
	            return userRepository.save(existingUser);
	        }
	        return null; // User not found
	    }

	    @Override
	    public void deleteUser(String userId) {
	    	userRepository.deleteById(userId);
	    }
	
	
	
	
	
}
