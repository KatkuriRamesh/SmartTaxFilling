package com.tax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tax.model.UserDetails;
import com.tax.reposistory.UserDetailsRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsRepository userDetailsReposistory;

	@Override
	public UserDetails saveUser(UserDetails details) {
		UserDetails userDetails = userDetailsReposistory.save(details);
		return userDetails;
	}

	@Override
	public UserDetails getAllUsersDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
