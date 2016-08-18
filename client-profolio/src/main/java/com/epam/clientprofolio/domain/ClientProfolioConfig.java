package com.epam.clientprofolio.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
@ConfigurationProperties(prefix="clientprofolio")
public class ClientProfolioConfig {
	
	private List<ClientProfolio> clientProfolioList = new ArrayList<ClientProfolio>();

	public List<ClientProfolio> getClientProfolioList() {
		return clientProfolioList;
	}

	public void setClientProfolioList(List<ClientProfolio> clientProfolioList) {
		this.clientProfolioList = clientProfolioList;
	}
	
	

}
