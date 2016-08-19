package com.epam.clientprofolio.dao.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.epam.clientprofolio.dao.ClientProfolioDao;
import com.epam.clientprofolio.domain.ClientProfolio;
import com.epam.clientprofolio.domain.ClientProfolioConfig;

@Component
public class ClientProfolioMockDaoImpl implements ClientProfolioDao {
		
	private ClientProfolioConfig clientProfolioConfig;
		
	@Autowired
	public ClientProfolioMockDaoImpl(ClientProfolioConfig clientProfolioConfig) {
		this.clientProfolioConfig = clientProfolioConfig;
	}

	public ClientProfolio getClientProfolioById(Long Id) {
		List<ClientProfolio> clientProfolioList = clientProfolioConfig.getClientProfolioList(); 
		if(!CollectionUtils.isEmpty(clientProfolioList)){
			clientProfolioList.forEach(System.out::println);
			for(ClientProfolio item : clientProfolioList){
				if(Id.longValue() == item.getId().longValue()){
					return item;
				}
			}
		}		
		return new ClientProfolio();
	}
}
