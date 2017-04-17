package com.restservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

	@RequestMapping("/welcome")
	public String welecome() {
		return " Welcome to Restfull service!";
	}

}
