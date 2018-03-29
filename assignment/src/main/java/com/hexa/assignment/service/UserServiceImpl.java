package com.hexa.assignment.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hexa.assignment.dao.UserDAO;
import com.hexa.assignment.model.User;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	UserDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String loginId) throws UsernameNotFoundException {

		User userByLoginId = userDAO.getUserByLoginId(loginId);
		
		GrantedAuthority authority = new  SimpleGrantedAuthority("USER");
		Collection<GrantedAuthority> authorityList = new ArrayList<>();
		authorityList.add(authority);
		org.springframework.security.core.userdetails.User user = 
				new org.springframework.security.core.userdetails.User(userByLoginId.getLoginId(), userByLoginId.getPassword(), authorityList);
		return user;
	}

}
