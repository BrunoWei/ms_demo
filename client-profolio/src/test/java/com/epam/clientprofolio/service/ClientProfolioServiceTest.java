package com.epam.clientprofolio.service;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import com.epam.clientprofolio.ClientProfolioApplication;
import com.epam.clientprofolio.dao.ClientProfolioDao;
import com.epam.clientprofolio.domain.ClientProfolio;
import com.epam.clientprofolio.service.impl.ClientProfolioServiceImpl;

@RunWith(MockitoJUnitRunner.class)
@SpringApplicationConfiguration(classes = ClientProfolioApplication.class)
@WebAppConfiguration 
@IntegrationTest("server.port:0") 
public class ClientProfolioServiceTest {
	
	private ClientProfolioService clientProfolioService;

	@Mock
	private ClientProfolioDao clientProfolioDao;

	@Before
	public void setUp() throws Exception {
		clientProfolioService = new ClientProfolioServiceImpl(clientProfolioDao);
	}

	@Test
	public void shouldGetClientProfolioById() {
		        // given
				ClientProfolio clientProfolio = new ClientProfolio(10000L,"BrunoWei",100);
				given(clientProfolioDao.getClientProfolioById(10000L)).willReturn(clientProfolio);
				// when
				ClientProfolio rtnClientProfolio = clientProfolioService.getClientProfolioById(10000L);				
				// then
				assertNotNull(rtnClientProfolio);
				assertTrue(rtnClientProfolio.getAge() == 100);
				assertEquals("BrunoWei", rtnClientProfolio.getName());
				verify(clientProfolioDao).getClientProfolioById(10000L);
	}

}
