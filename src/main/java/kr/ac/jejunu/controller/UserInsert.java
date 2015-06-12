package kr.ac.jejunu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.UserService;

@Controller
@RequestMapping("/insert")
public class UserInsert {

	@Autowired
	private UserService userService;
	
	@RequestMapping
	public String insertUser(User user) {
		
		userService.insertUser(user);
		
		return "redirect:index";
	}
}
