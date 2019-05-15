package com.tax.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/getname/{name}")
	public String getName(@PathVariable String name) {
		return name;
	}
}
