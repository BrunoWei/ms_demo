package com.epam.clientprofolio.web;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import com.epam.clientprofolio.ClientProfolioApplication;
import com.epam.clientprofolio.domain.ClientProfolio;
import com.epam.clientprofolio.service.ClientProfolioService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ClientProfolioApplication.class)
@WebAppConfiguration
//@IntegrationTest("server.port:0")
public class ClientProfolioRestControllerTest {

//	private MockMvc mockMvc;
//
//	@Mock
//	private ClientProfolioService clientProfolioService;
//	
//	private final String BASE_URL = "http://localhost:8080/";
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
	
	@Before
	public void setUp() throws Exception {
		 //this.mockMvc = webAppContextSetup(webApplicationContext).build();
	}

	@Test
	public void shouldGetClientProfolioById() throws Exception {
		 // given
//		 ClientProfolio clientProfolio = new ClientProfolio(1000L,"BrunoWei",100);
//		 given(clientProfolioService.getClientProfolioById(10000L)).willReturn(clientProfolio);
		// when
//		 mockMvc.perform(get("/clientprofolio/10000")
//		            .contentType(MediaType.APPLICATION_JSON)
//		            .content(objectMapper.writeValueAsBytes(new CreateClientRequest("Foo"))))
//		            .andExpect(status().isCreated())
//		            .andExpect(jsonPath("$.name", is("Foo")))
//		            .andExpect(jsonPath("$.number", notNullValue()));
//		 this.mockMvc.perform(get("/clientprofolio/10000")
//                 .accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
//                 .andExpect(status().isOk())
//                 .andExpect(content().contentType("application/json"));
	}

}
