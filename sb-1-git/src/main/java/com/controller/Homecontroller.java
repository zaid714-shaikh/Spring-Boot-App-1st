package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@RequestMapping("/")
	public String getMsg() {
		return "Welcome To Exponent";
	}
}
