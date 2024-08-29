package com.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.query.ReturnableType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.Users;
import com.demo.repo.UsersRepo;

@Component
public class UserService {

	@Autowired
	private UsersRepo usersRepo;

	public List<Users> getAllUser(){
		
		return this.usersRepo.findAll();
//		List<Users> list = new ArrayList<>();
//		Users u1 = new Users(1, "java", 98765312, "ahmedabad");
//		Users u2 = new Users(2, "python", 98765312, "ahmedabad");
//		Users u3 = new Users(3, "php", 98765312, "ahmedabad");
//		list.add(u1);
//		list.add(u2);
//		list.add(u3);
//		
//		return list;
	}
	
	public Users addUser(Users u) {
		return this.usersRepo.save(u);
	}
	
	public void deleteUser(int id) {
		this.usersRepo.deleteById(id);
	}
	
	public void updateUser(Users u) {
		this.usersRepo.save(u);
	}
}

