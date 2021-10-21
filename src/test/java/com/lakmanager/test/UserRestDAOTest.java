package com.lakmanager.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.lakmanager.model.UserDAO;
import com.lakmanager.model.UserDTO;
import com.lakmanager.model.UserRestDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@WebAppConfiguration
public class UserRestDAOTest {
	@Autowired
	UserDAO dao;
	
	@Autowired
	UserRestDAO restDAO;
	
	List<UserDTO> list;
	
	@Before
	public void setUp() {
		dao.deleteAllUser();
		UserDTO user1 = new UserDTO("test", "1234", "testName", "testServer");
		UserDTO user2 = new UserDTO("test2", "1234", "testName2", "testServer2");
		
		list = new ArrayList<UserDTO>();
		list.add(user1);
		list.add(user2);
		
		for(UserDTO dto : list)
			dao.addUser(dto);
		
	}
	
	@Test
	public void idCheckTest() {
		assertThat(restDAO.idCheck("test"), is(1));
	}
}
