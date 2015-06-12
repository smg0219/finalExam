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
}
