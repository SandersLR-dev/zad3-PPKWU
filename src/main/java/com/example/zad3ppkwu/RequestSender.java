package com.example.zad3ppkwu;

import org.springframework.web.client.RestTemplate;

public class RequestSender {

    public String send(String address, String text) {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(address + "/" + text, String.class);
    }
}
