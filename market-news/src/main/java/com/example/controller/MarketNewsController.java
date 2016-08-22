package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import com.example.response.MarketNewsResponse;
import com.example.service.IMarketNewsService;

import java.util.Date;

import static org.springframework.format.annotation.DateTimeFormat.ISO.*;

@RestController
@RequestMapping("/marketNews")
public class MarketNewsController {

    @Autowired
    private IMarketNewsService marketNewsService;

    @GetMapping("/{publishDate}")
    public MarketNewsResponse execute(@PathVariable @DateTimeFormat(iso= DATE) Date publishDate) {
        return marketNewsService.retrieveMarketNews(publishDate);
    }
}
