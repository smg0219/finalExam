package kr.ac.jejunu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.service.UserService;

@Controller
@RequestMapping("/certification")
public class UserCertification {

	@Autowired
	private UserService userService;
	
	@RequestMapping
	public String certificationUser(User user) {
		
		User inquireUser = userService.certificationUser(user.getEmail());
		
		if (inquireUser.getPassword().equals(user.getPassword()))
			return "redirect:loginAfter";
		else
			return "redirect:signIn";
	}
}
