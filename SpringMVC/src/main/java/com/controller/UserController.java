package com.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String indexPage() {
		return "index";
	}

	@RequestMapping("/register")
	public String registerPage(Model m) {
		m.addAttribute("id",1);
		m.addAttribute("name", "java");
		m.addAttribute("list", Arrays.asList("java","python","php","node"));
		return "register";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
}
