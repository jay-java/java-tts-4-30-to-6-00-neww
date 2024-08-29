package com.demo.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.demo.model.User;
import com.demo.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String indexPage(Model m) {
		m.addAttribute("number", 123);
		m.addAttribute("name", "java");
		m.addAttribute("list", Arrays.asList("java","php","python","dart"));
		return "index";
	}
	
	@RequestMapping("/about")
	public String aboutPage() {
		return "about";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public RedirectView registerUser(@ModelAttribute User u) {
		System.out.println(u);
		this.userService.insertUser(u);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("/");
		return redirectView;
	}
	
	@RequestMapping("/allUser")
	public String getAllUser(Model m) {
		m.addAttribute("list", this.userService.getAllUser());
		return "home";
	}
}
