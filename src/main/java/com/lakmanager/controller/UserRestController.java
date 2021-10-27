package com.lakmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lakmanager.serviceInterface.UserRestService;

@RestController
@RequestMapping("/user")
public class UserRestController {
	@Autowired
	UserRestService restService;
	
	@GetMapping(value = "/idCheck", produces = "text/plain;charset=UTF-8;")
	public String idCheck(@RequestParam("id")String id) {
		return String.valueOf(restService.idCheck(id));
	}
}
