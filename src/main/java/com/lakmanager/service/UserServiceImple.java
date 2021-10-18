package com.lakmanager.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakmanager.model.UserDAO;
import com.lakmanager.model.UserDTO;

@Service
public class UserServiceImple implements UserService {
	@Autowired
	UserDAO dao;
	
	@Override
	public void join(UserDTO dto) {
		dao.addUser(dto);
	}

	@Override
	public boolean login(UserDTO dto, HttpSession session) {
		boolean flag = false;
		UserDTO user = dao.login(dto);
		
		if(user != null) {
			flag = true;
			session.setAttribute("user", user);
		}
		
		return flag;
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub

	}

	@Override
	public void withdrawal(UserDTO dto) {
		// TODO Auto-generated method stub

	}

}
