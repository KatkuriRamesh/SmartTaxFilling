package com.tax.service;

import org.springframework.stereotype.Service;

import com.tax.model.UserDetails;

@Service
public interface UserDetailsService {

	public UserDetails saveUser(UserDetails details);

	public UserDetails getAllUsersDetails();

}
