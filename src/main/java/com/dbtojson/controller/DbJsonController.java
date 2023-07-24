package com.dbtojson.controller;

import com.dbtojson.dto.ApplicationDto;
import com.dbtojson.dto.Body;
import com.dbtojson.service.DbJsonService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

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
        Body body = dbJsonService.getApplicationData(301);
        return new ResponseEntity<>(body, HttpStatus.OK);
    }
}
