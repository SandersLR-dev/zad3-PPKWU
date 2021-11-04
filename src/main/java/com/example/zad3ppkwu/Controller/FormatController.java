package com.example.zad3ppkwu.Controller;

import com.example.zad3ppkwu.RequestSender;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class FormatController {


    @GetMapping("/JSON/{text}")
    public Map jsonInterpreter(@PathVariable String text) throws IOException {

        RequestSender requestSender = new RequestSender();

        String response= requestSender.send("http://localhost:8080",text);

        ObjectMapper mapper = new ObjectMapper();

        return mapper.readValue(response,Map.class);

    }
}
