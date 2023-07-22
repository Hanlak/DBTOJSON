package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class CompanyNameDto {

	@JsonProperty("company_short_name")
	private String companyShortName;
	
	@JsonProperty("company_full_name")
	private String companyFullName;
}
