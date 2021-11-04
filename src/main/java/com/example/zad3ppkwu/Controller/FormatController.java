package com.example.zad3ppkwu.Controller;

import com.example.zad3ppkwu.RequestSender;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;
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

        String response = requestSender.send("http://localhost:8080", text);

        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(response, Map.class);
    }

    @GetMapping(value = "/XML/{text}", produces = {"application/xml", "text/xml"})
    public String xmlInterpreter(@PathVariable String text) {

        RequestSender requestSender = new RequestSender();

        String response = requestSender.send("http://localhost:8080", text);

        JSONObject jsonObject = new JSONObject(response);

        String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-15\"?>\n<" + "root" + ">" + XML.toString(jsonObject) + "</" + "root" + ">";

        return xml;
    }


}
