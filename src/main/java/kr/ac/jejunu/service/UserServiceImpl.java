package kr.ac.jejunu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jejunu.model.User;
import kr.ac.jejunu.repository.ProductDao;
import kr.ac.jejunu.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> list() {
		return userDao.findAll();
	}

	@Override
	public void insertUser(User user) {
		userDao.insertUser(user);
	}

	@Override
	public User certificationUser(String email) {
		return userDao.certificationUser(email);
	}
}
