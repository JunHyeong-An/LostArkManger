package com.lakmanager.model;

public class UserDTO {
	private String id, password, name, server;
	
	public UserDTO() {}
	
	public UserDTO(String id, String password, String name, String server) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.server = server;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}
}
