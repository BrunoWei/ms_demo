package com.example.response;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

import com.example.pojo.MarketNews;

@ConfigurationProperties("marketNewsResponse")
@Component
public class MarketNewsResponse {
	private List<MarketNews> marketNewsList;

	public List<MarketNews> getMarketNewsList() {
		return marketNewsList;
	}

	public void setMarketNewsList(List<MarketNews> marketNewsList) {
		this.marketNewsList = marketNewsList;
	}
}
