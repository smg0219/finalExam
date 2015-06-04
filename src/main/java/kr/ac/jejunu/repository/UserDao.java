package kr.ac.jejunu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jejunu.model.User;

@Repository
public interface UserDao {

	List<User> findAll();

}
