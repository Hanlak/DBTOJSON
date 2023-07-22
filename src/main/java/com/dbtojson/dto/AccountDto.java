package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AccountDto{
	
	@JsonProperty("command")
    private String command;
	
	@JsonProperty("account_number")
    private String accountNumber;
	
	@JsonProperty("currency")
    private String currency;
	
	@JsonProperty("account_type")
    private String accountType;
	
	//@JsonProperty("account")
	private AccountObjectDto accountObject;
}