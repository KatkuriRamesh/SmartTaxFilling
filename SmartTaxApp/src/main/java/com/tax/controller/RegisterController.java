package com.tax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tax.model.Register;
import com.tax.service.RegisterService;

@RestController
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@PostMapping("/register")
	public Register name(@RequestBody Register register) {
		System.out.println(register);
		return registerService.saveRegister(register);

	}

}
