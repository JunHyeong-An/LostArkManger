package com.lakmanager.model;

import java.util.List;

public interface CharacterDAO {
	void addCharater(CharacterDTO dto);
	void deleteCharater(String charName);
	CharacterDTO selectCharater(String charName);
	void deleteAll();
	List<CharacterDTO> selectAllCharacter(String id);
}
