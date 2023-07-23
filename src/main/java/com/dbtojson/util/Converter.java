package com.dbtojson.util;

import com.dbtojson.dto.ApplicationDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.apachecommons.CommonsLog;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Converter {
    private ObjectMapper objectMapper;

    public Converter(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public Optional<String> objToJson(ApplicationDto applicationDto) {
        Optional<String> json = Optional.empty();
        try {
            json = Optional.of(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(applicationDto));
        } catch (JsonProcessingException e) {
            System.out.println("failed conversion: Pfra object to Json");
        }
        return json;
    }

    public String toXML(String json) throws JsonProcessingException {
        JSONObject jsonObject = new JSONObject(json);
        return XML.toString(jsonObject);
    }
}
