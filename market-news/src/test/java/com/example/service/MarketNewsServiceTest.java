package com.example.service;

import com.example.response.MarketNewsResponse;
import com.example.service.impl.MarketNewsServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarketNewsServiceTest {

    private IMarketNewsService marketNewsService;

    @Before
    public void init(){
        marketNewsService = new MarketNewsServiceImpl();
    }

    @Test
    public void testRetrieveMarketNews(){
        MarketNewsResponse marketNewsResponse = marketNewsService.retrieveMarketNews(new Date());

        Assert.assertNull(marketNewsResponse);
    }
}
