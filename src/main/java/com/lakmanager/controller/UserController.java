package com.lakmanager.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lakmanager.model.UserDTO;
import com.lakmanager.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService us;
	
	@GetMapping("/join")
	public void join() {}
	
	@PostMapping("/join")
	public String join(UserDTO dto) {
		us.join(dto);
		return "redirect:/user/login";
	}
	
	@GetMapping("login")
	public void login() {}
	
	@PostMapping("login")
	public String login(UserDTO dto, HttpSession session) {
		boolean flag = us.login(dto, session);
		
		if(flag) return "/index";
		else return "redirect:/user/login";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession sessoin) {
		us.logout(sessoin);
		return "redirect:/";
	}
	
	@GetMapping("/modify")
	public void modify() {}
	
	@PostMapping("/modify")
	public String modify(UserDTO dto) {
		us.modifyUser(dto);
		
		return "redirect:/user/logout";
	}
	
}
