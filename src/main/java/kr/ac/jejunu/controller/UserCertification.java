package kr.ac.jejunu.controller;

import javax.servlet.http.HttpServletRequest;

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
	public String certificationUser(HttpServletRequest req, User user) {
		
		User inquireUser = userService.certificationUser(user.getEmail());
		
		if (inquireUser.getPassword().equals(user.getPassword()))
			return certificationUserSession(req, inquireUser);
		else
			return "redirect:signIn";
	}

	private String certificationUserSession(HttpServletRequest req, User inquireUser) {
		
		String url ="redirect:";
		
		if (inquireUser.getAuthority().equals("company")) {
			req.getSession().setAttribute("company", inquireUser);
			url += "loginAfter";
		} else {
			req.getSession().setAttribute("personal", inquireUser);
			url += "loginAfterPersonal";
		}
		return url;
	}
}
