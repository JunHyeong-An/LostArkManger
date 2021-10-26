package com.lakmanager.model;

public class CharaterDTO {
	private String id, charName, charLevel;
	
	public CharaterDTO(String id, String charName, String charLevel) {
		this.id = id;
		this.charName = charName;
		this.charLevel = charLevel;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getCharLevel() {
		return charLevel;
	}

	public void setCharLevel(String charLevel) {
		this.charLevel = charLevel;
	}
}
