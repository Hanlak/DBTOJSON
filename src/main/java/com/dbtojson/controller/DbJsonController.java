package com.dbtojson.controller;

import com.dbtojson.dto.CustomerDto;
import com.dbtojson.service.DbJsonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class DbJsonController {

    @Autowired
    DbJsonService dbJsonService;

    @GetMapping("/dbToJson/health")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("Health OK!!", HttpStatus.OK);
    }

    // Retrieve
    @GetMapping("/dbToJson/find/suggestion")
    ResponseEntity<List<CustomerDto>> getAllSuggestionsByGroupName() {

        List<CustomerDto> dos = dbJsonService.findAllCustomers();
        return new ResponseEntity<>(dos, HttpStatus.OK);
    }

}
