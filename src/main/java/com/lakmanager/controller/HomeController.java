package com.lakmanager.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lakmanager.model.CharacterDTO;
import com.lakmanager.serviceInterface.CharacterService;

@Controller
public class HomeController {
	@Autowired
	CharacterService cs;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("/getCharacter")
	public String getCharacter(@RequestParam("character_name")String name ,HttpSession session) throws IOException {
		List<CharacterDTO> list = cs.getCharacterNames(name, session);
		session.setAttribute("characterList", list);
		return "redirect:/";
	}
}
