package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ContactDataDto {

	@JsonProperty("commun_method")
	private String communmethod;

	@JsonProperty("commun_address")
	private String communAddress;
}
