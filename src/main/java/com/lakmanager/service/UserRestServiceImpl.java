package com.lakmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakmanager.model.UserRestDAO;
import com.lakmanager.serviceInterface.UserRestService;

@Service
public class UserRestServiceImpl implements UserRestService {
	@Autowired
	UserRestDAO restDAO;
	
	@Override
	public int idCheck(String id) {
		return restDAO.idCheck(id);
	}
}
