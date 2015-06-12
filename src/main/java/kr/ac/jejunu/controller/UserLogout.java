package kr.ac.jejunu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("logout")
public class UserLogout {

	@RequestMapping
	public String logout(HttpSession session) {
		session.setAttribute("company", null);
		session.setAttribute("personal", null);
		
		return "redirect:index";
	}
}
