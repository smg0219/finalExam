package kr.ac.jejunu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.UserService;

@Controller
public class UserInfo {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/signUp")
	public String signUp() {
		
		return "signUp";
	}

	@RequestMapping("/signIn")
	public String signIn() {
		return "signIn";
	}

	/*
	@RequestMapping("/redirectSignInPage")
	public String redirectSignInPage(User user) {
	
		System.out.println(user.getId());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getGender());
		System.out.println(user.getAuthority());
		
		userService.insertUser(user);
		
		return "redirect:signIn";
	}
	*/
}
