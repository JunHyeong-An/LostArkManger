package com.lakmanager.model;

public interface CharaterDAO {
	void addCharater(CharaterDTO dto);
	void deleteCharater(String charName);
	CharaterDTO selectCharater(String charName);
	void deleteAll();
}
