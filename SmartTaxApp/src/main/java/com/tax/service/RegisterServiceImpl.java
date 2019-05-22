package com.tax.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tax.model.Register;
import com.tax.reposistory.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	RegisterRepository registerReposistory;

	@Override
	public Register saveRegister(Register register) {
		System.out.println("service" + register);
		return registerReposistory.save(register);
	}

}
