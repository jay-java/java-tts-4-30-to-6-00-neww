package com.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.User;
import com.demo.repo.UserRepo;

@Component
public class UserService {

	@Autowired
	private UserRepo userRepo;
	
	public void insertUser(User u) {
		this.userRepo.save(u);
	}
	
	public List<User> getAllUser(){
		return this.userRepo.findAll();
	}
}
