package com.example.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.response.MarketNewsResponse;
import com.example.service.IMarketNewsService;

@Service
public class MarketNewsServiceImpl implements IMarketNewsService {

	@Autowired
	private MarketNewsResponse marketNewsResponse;

	@Override
	public MarketNewsResponse retrieveMarketNews(Date date) {
		return marketNewsResponse;
	}

}
