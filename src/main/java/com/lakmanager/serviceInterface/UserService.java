package com.lakmanager.serviceInterface;

import javax.servlet.http.HttpSession;

import com.lakmanager.model.UserDTO;

public interface UserService {
	void join(UserDTO dto);
	boolean login(UserDTO dto, HttpSession session);
	void logout(HttpSession session);
	void withdrawal(UserDTO dto); 
	void modifyUser(UserDTO dto);
}
