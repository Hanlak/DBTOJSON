package com.dbtojson.util;

import com.dbtojson.dto.Body;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Converter {
    private ObjectMapper objectMapper;

    public Converter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Optional<String> objToJson(Body body) {
        Optional<String> json = Optional.empty();
        try {
            json = Optional.of(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(body));
        } catch (JsonProcessingException e) {
            System.out.println("failed conversion: object to Json");
        }
        return json;
    }

    public String toXML(String json) throws JsonProcessingException {
        JSONObject jsonObject = new JSONObject(json);
        return XML.toString(jsonObject);
    }
}
