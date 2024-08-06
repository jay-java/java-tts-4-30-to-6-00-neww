package com.demo;

import java.util.Optional;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.jpa.UserJPA;
import com.demo.model.User;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BootJpaApplication.class, args);
		UserJPA userJPA = context.getBean(UserJPA.class);
		
//		User user  = new User(2, "dot net", "delhi", 98765432);
//		userJPA.save(user);
		
		Optional<User> user = userJPA.findById(1);
		System.out.println(user);
	}

//	public void insertUser(User u) {
//		UserJPA userJPA  = null;
//		userJPA.save(u);
//	}
//	
//	public void udpateUser(User u) {
//		UserJPA userJPA  = null;
//		userJPA.save(u);
//	}
//	
//	public void deleteUser(int id) {
//		UserJPA userJPA = null;
//		userJPA.deleteById(id);
//	}
//	
//	public User getDataByid(int id) {
//		UserJPA userJPA = null;
//		return userJPA.getById(id);
//
//	}

}
