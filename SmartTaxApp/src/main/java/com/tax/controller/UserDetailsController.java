package com.tax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tax.model.UserDetails;
import com.tax.service.UserDetailsService;

@RestController
public class UserDetailsController {

	@Autowired
	UserDetailsService userDetailsService;

	@PostMapping("/saveuserdetails")
	public UserDetails name(@RequestBody UserDetails details) {
		UserDetails userDetails = userDetailsService.saveUser(details);
		return userDetails;

	}

}
