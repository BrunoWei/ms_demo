package com.epam.clientprofolio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epam.clientprofolio.dao.ClientProfolioDao;
import com.epam.clientprofolio.domain.ClientProfolio;
import com.epam.clientprofolio.service.ClientProfolioService;

@Service
public class ClientProfolioServiceImpl implements ClientProfolioService {
	
	private ClientProfolioDao clientProfolioDao;

	@Autowired
	public ClientProfolioServiceImpl(ClientProfolioDao clientProfolioDao) {
		this.clientProfolioDao = clientProfolioDao;
	}

	@Override
	public ClientProfolio getClientProfolioById(Long Id) {
		return clientProfolioDao.getClientProfolioById(Id);
	}

}
