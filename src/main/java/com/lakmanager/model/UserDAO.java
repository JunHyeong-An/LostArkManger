package com.lakmanager.model;

import java.util.List;

public interface UserDAO {
	List<UserDTO> getUserList();
	UserDTO getUser(String id);
	void addUser(UserDTO dto);
	void modifyUser(UserDTO dto);
	void deleteUser(String id);
	void deleteAllUser();
	UserDTO login(UserDTO dto);
}
