package com.karvekar.stockplayservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/root")
public class TestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/testMethod")
    public String testMethod(){
        System.out.println("Test Method");

        //System.out.println(restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/1",Object.class).toString());


        //return restTemplate.getForObject("https://www.nseindia.com/api/equity-stockIndices?index=NIFTY%2050",String.class);
        final RestTemplate restTemplate = new RestTemplate();
        final String response = restTemplate.getForObject("https://www.nseindia.com/api/equity-stockIndices?{indexN}={NIFTY%2050N}", String.class, "index","NIFTY%2050");

        System.out.println(response);


        return response;

    }
}
