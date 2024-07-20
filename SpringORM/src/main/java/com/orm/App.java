package com.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("app starteed");
		ApplicationContext con  =new ClassPathXmlApplicationContext("com/orm/config.xml");
		DAO dao = (DAO)con.getBean("dao");
		System.out.println("context get");
//		Model m1 = new Model(2, "python", 9876540, "delhi");
//		dao.saveUser(m1);
//		System.out.println("data saved");
		
//		Model m = dao.getSingleUser(1);
//		System.out.println(m);
		
//		List<Model> list = dao.getAllUsers();
//		System.out.println(list);
//		
//		Model m = new Model(1,"java",986854,"xyz");
//		dao.saveUser(m);
		
		
		dao.deleteUser(1);
		System.out.println("data deleted");
	}
}
