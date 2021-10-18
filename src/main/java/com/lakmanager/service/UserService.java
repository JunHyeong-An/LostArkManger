package com.lakmanager.service;

import javax.servlet.http.HttpSession;

import com.lakmanager.model.UserDTO;

public interface UserService {
	void join(UserDTO dto);
	boolean login(UserDTO dto, HttpSession session);
	void logout();
	void withdrawal(UserDTO dto); 
}
