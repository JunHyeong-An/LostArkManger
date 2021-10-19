package com.lakmanager.test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@WebAppConfiguration
public class UserDAOTest {
	@Autowired
	private UserDAO dao;
	
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
	public void getUserListTest() {
		List<UserDTO> testList = dao.getUserList();
		
		assertThat(testList.get(0).getId(), is("test"));
		assertThat(testList.get(1).getId(), is("test2"));
	}
	
	@Test
	public void getUserTest() {
		UserDTO dto = dao.getUser("test");
		assertThat(dto.getId(), is("test"));
	}
	
	@Test
	public void modifyUserTest() {
		UserDTO dto = dao.getUser("test");
		dto.setId("modifyTest");
		dao.modifyUser(dto);
		
		assertThat(dto.getId(), is("modifyTest"));
	}
	
	@Test
	public void deleteUser() {
		dao.deleteUser("test");
		assertThat(dao.getUser("test"), is(nullValue()));
	}
}
