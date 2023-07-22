package com.dbtojson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbtojson.dto.AccountDto;
import com.dbtojson.dto.CustomerDto;
import com.dbtojson.dto.MerchantDto;
import com.dbtojson.service.DbJsonAccountService;
import com.dbtojson.service.DbJsonMerchantService;
import com.dbtojson.service.DbJsonService;

@RestController
public class DbJsonController {

	@Autowired
	DbJsonService dbJsonService;

	@Autowired
	DbJsonMerchantService dbJsonMerchantService;

	@Autowired
	DbJsonAccountService dbJsonAccountService;

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

	@GetMapping("/dbToJson/find/merchants")
	ResponseEntity<List<MerchantDto>> getAllMerchants() {

		List<MerchantDto> findAllMerchants = dbJsonMerchantService.findAllMerchants();
		return new ResponseEntity<>(findAllMerchants, HttpStatus.OK);

	}

	@GetMapping("/dbToJson/find/accounts")
	ResponseEntity<List<AccountDto>> getAllAccounts() {

		List<AccountDto> findAllAccounts = dbJsonAccountService.findAllAccounts();
		return new ResponseEntity<>(findAllAccounts, HttpStatus.OK);

	}

}
