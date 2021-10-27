package com.lakmanager.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakmanager.model.CharacterDAO;
import com.lakmanager.model.CharacterDTO;
import com.lakmanager.model.UserDTO;
import com.lakmanager.serviceInterface.CharacterService;

@Service
public class CharacterImpl implements CharacterService {
	@Autowired
	CharacterDAO dao;

	@Override
	public List<CharacterDTO> getCharacterNames(String name, HttpSession session) throws IOException {
		List<CharacterDTO> list = new ArrayList<CharacterDTO>();
		String url = "https://lostark.game.onstove.com/Profile/Character/" + name;
		Connection con = Jsoup.connect(url);
		
		Document doc = con.get();
		
		Elements charElems = doc.getElementsByClass("profile-character-list__char");
		
		for(Element e : charElems) {
			for(Element e2 : e.getElementsByTag("button")) {
				UserDTO user = (UserDTO)session.getAttribute("user");
				CharacterDTO dto = new CharacterDTO(user.getId(), 
						e2.childNode(3).childNode(0).toString(), 
						"level");
				list.add(dto);
				dao.addCharater(dto);
			}
		}
		return list;
	}
}
