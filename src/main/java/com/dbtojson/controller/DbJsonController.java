package com.dbtojson.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbtojson.dto.MerchantDto;
import com.dbtojson.service.DbJsonService;

@RestController
public class DbJsonController {
	@Autowired
	DbJsonService dbJsonService;

	@GetMapping("/dbToJson/health")
	public ResponseEntity<String> checkHealth() {
		return new ResponseEntity<>("Health OK!!", HttpStatus.OK);
	}

	@GetMapping("/dbToJson/find/merchant")
	ResponseEntity<MerchantDto> getMerchant() {
		MerchantDto merchantDto = dbJsonService.getData(301);
		return new ResponseEntity<>(merchantDto,HttpStatus.OK);
	}
}
