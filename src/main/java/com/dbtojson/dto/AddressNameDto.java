package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AddressNameDto {

	@JsonProperty("region")
	private String region;
	
	@JsonProperty("city")
	private String city;
	
	@JsonProperty("street")
	private String street;
}
