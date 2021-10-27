package com.lakmanager.serviceInterface;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.lakmanager.model.CharacterDTO;

public interface CharacterService {
	List<CharacterDTO> getCharacterNames(String name, HttpSession session) throws IOException;
}
