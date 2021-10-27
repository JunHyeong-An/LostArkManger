package com.lakmanager.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakmanager.model.CharacterDAO;
import com.lakmanager.model.UserDAO;
import com.lakmanager.model.UserDTO;
import com.lakmanager.serviceInterface.UserService;

@Service
public class UserServiceImple implements UserService {
	@Autowired
	UserDAO dao;
	
	@Autowired
	CharacterDAO charDao;
	
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
		session.setAttribute("characterList", charDao.selectAllCharacter(dto.getId()));
		return flag;
	}

	@Override
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@Override
	public void withdrawal(UserDTO dto) {
		// TODO Auto-generated method stub

	}
	@Override
	public void modifyUser(UserDTO dto) {
		dao.modifyUser(dto);	
	}
}
