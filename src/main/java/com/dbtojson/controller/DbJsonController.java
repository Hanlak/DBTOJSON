package com.dbtojson.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbtojson.dto.Body;
import com.dbtojson.service.DbJsonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class DbJsonController {
    @Autowired
    DbJsonService dbJsonService;

    @GetMapping("/dbToJson/health")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("Health OK!!", HttpStatus.OK);
    }

    @GetMapping("/dbToJson/find/application")
    ResponseEntity<Body> getMerchant() throws IOException {
        Body body = dbJsonService.getApplicationData(302);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/find/customerJsonToXml", consumes = {MediaType.APPLICATION_JSON_VALUE})
    String createCustomerDataForXml(@RequestBody String str) throws JsonMappingException, JsonProcessingException
    {
    	
    	String strXml = dbJsonService.processJsonToXml(str);
    	
    	return strXml;
    }


}
