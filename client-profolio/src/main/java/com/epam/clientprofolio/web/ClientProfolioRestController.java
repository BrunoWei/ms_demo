package com.epam.clientprofolio.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epam.clientprofolio.domain.ClientProfolio;
import com.epam.clientprofolio.service.ClientProfolioService;


@RestController
@RequestMapping("/clientprofolio")
public class ClientProfolioRestController {
	
	private ClientProfolioService clientProfolioService;
	
	@Autowired
	public ClientProfolioRestController(ClientProfolioService clientProfolioService) {
		this.clientProfolioService = clientProfolioService;
	}
	
	@RequestMapping("/{id}")
	public ClientProfolio getClientProfolioById(@PathVariable Long id){
		return clientProfolioService.getClientProfolioById(id);
	}
}
