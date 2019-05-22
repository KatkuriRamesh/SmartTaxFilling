package com.tax.service;

import org.springframework.stereotype.Service;

import com.tax.model.Register;

@Service
public interface RegisterService {

	public Register saveRegister(Register register);


}
