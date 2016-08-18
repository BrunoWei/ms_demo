package com.example.service;

import java.util.Date;

import com.example.response.MarketNewsResponse;

public interface IMarketNewsService {
	
	MarketNewsResponse retrieveMarketNews(Date date);
	
}
