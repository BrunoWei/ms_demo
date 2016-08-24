package com.epam.clientprofolio.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.epam.clientprofolio.ClientProfolioApplication;
import com.epam.clientprofolio.domain.ClientProfolio;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ClientProfolioApplication.class)
@WebAppConfiguration 
//@IntegrationTest("server.port:0") 
public class ClientProfolioDaoTest {
	
	@Autowired
	private ClientProfolioDao clientProfolioDao;
	
	@Test
	public void shouldGetClientProfolioById() {
		ClientProfolio clientProfolio = clientProfolioDao.getClientProfolioById(10001L);
		assertNotNull(clientProfolio);
		assertEquals("Jackson", clientProfolio.getName());
		assertTrue(clientProfolio.getAge()==40);
	}

}
