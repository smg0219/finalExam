package kr.ac.jejunu.service;

import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.User;

public interface UserService {

	java.util.List<User> list();

	void insertUser(User user);

	User certificationUser(String email);
}
