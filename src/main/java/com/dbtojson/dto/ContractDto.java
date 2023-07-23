package com.dbtojson.dto;

import java.util.ArrayList;
import java.util.Date;

import org.apache.catalina.Service;

import com.dbtojson.entity.Account;
import com.dbtojson.entity.Merchant;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ContractDto {

	@JsonProperty("command")
	private String command;

	@JsonProperty("contract_type")
	private String contractType;

	@JsonProperty("product_id")
	private int productId;

	@JsonProperty("contract_number")
	private int contractNumber;

	@JsonProperty("start_date")
	private Date startDate;

	// @JsonProperty("merchant")
	private MerchantDto merchant;

	// @JsonProperty("service")
	private ArrayList<ServiceDto> service;

	//@JsonProperty("account")
	private AccountDto account;
}
