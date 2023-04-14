package com.copilot.demo;

import com.copilot.demo.config.Config;
import com.copilot.demo.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class APIClient {

    //Declare Constant for API URL
    private static final String API_URL = "http://localhost:8080/api/user";

    //Autowired Config
    @Autowired
    private Config config;

    //method to call post api using rest template from config and return the response
    public String postUser(User user){
        return config.restTemplate().postForObject(API_URL, user, String.class);
    }

    //method to call get api using rest template from config and return the response
    public String getUser(String email){
        return config.restTemplate().getForObject(API_URL + "/" + email, String.class);
    }

    //method to call get api using rest template from config and return the response
    public void getUser(){
        config.restTemplate().getForObject(API_URL + "/all", String.class);
    }



}
