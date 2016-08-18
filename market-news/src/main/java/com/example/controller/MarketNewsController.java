package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.MarketNewsRequest;
import com.example.response.MarketNewsResponse;
import com.example.service.IMarketNewsService;

@RestController
@RequestMapping("/marketNews")
public class MarketNewsController {
	
	@Autowired
	private IMarketNewsService marketNewsService;
	
	@GetMapping
	public MarketNewsResponse execute(@RequestBody MarketNewsRequest req){
		return marketNewsService.retrieveMarketNews(req.getPublishDate());
	}
}
