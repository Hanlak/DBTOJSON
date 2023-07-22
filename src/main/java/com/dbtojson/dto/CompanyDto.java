package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CompanyDto {

	@JsonProperty("command")
	private String command;
	
	@JsonProperty("incorp_form")
    private String incorpForm;
	
	//@JsonProperty("company_name")
    private CompanyNameDto companyName;
	
	//@JsonProperty("identity_card")
    private IdentityCardDto identityCard;
}
