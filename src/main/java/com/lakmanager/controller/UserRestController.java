package com.lakmanager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@PostMapping(value = "/idCheck", produces = "text/plain;charset=UTF-8;")
	public String idCheck() {
		return "hello";
	}
}
