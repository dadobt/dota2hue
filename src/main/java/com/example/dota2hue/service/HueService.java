package com.example.dota2hue.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by dvilos on 8/3/2017.
 */
@Service
public class HueService {

    @Value("${philips.hue.ip}")
    private String hueIp;
    @Value("${philips.hue.username}")
    private String username;


    private RestTemplate restTemplate = new RestTemplate();

    public void dosomething(String json,int number){
        restTemplate.put("http://"+hueIp+"/api/"+username+"/lights/"+number+"/state",json);
    }


}
