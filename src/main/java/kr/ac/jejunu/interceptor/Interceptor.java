package kr.ac.jejunu.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.jejunu.model.User;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {

		HttpSession session = request.getSession();
		
		User user = (User) session.getAttribute("company");
		User user2 = (User) session.getAttribute("personal");
		
		if (user == null && user2 == null) {
			response.sendRedirect("signIn");	
			return false;
		} else {
			return super.preHandle(request, response, handler);
		}
	}
	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
//		
//		System.out.println("----- PreHandler Call -----");
//		
//		try {
//			if (request.getSession().getAttribute("admin") == null) {
//				response.sendRedirect("/index");
//				
//				return false;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		return true;
//	}
}
