package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AddressDto {

	@JsonProperty("command")
	private String command;
	
	@JsonProperty("address_type")
    private String addressType;
	
	@JsonProperty("country")
    private String country;
	
	@JsonProperty("address_name")
    private AddressNameDto addressName;
	
	@JsonProperty("house")
    private String house;
	
	@JsonProperty("apartment")
    private String apartment;
	
	@JsonProperty("postal_code")
    private String postalCode;
}
