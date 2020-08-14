package com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.model.MyUserDetails;
import com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.model.User;
import com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> userDetails = userRepository.findByUserName(username);
		userDetails.orElseThrow(() -> new UsernameNotFoundException("Not found : "+username));
		return userDetails.map(MyUserDetails::new).get();
	}

}
