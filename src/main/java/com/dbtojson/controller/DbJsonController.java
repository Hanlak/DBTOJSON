package com.dbtojson.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class DbJsonController {

    @GetMapping("/dbToJson/health")
    public ResponseEntity<String> checkHealth() {
        return new ResponseEntity<>("Health OK!!", HttpStatus.OK);
    }

    // Retrieve
    @GetMapping("/dbToJson/find/suggestion")
    ResponseEntity<String> getAllSuggestionsByGroupName() {
        return new ResponseEntity<>("", HttpStatus.OK);
    }


}
