package com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	Optional<User> findByUserName(String userName);
}
