package com.tax.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Test {

	@RequestMapping("/getname")
	public String getNam() {
		return "home.jsp";
	}

	@RequestMapping("/")
	public String getName() {
		return "home.jsp";
	}
}
