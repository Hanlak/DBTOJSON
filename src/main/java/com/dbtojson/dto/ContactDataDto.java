package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

import java.math.BigInteger;

@Data
public class ContactDataDto {

	@JsonProperty("commun_method")
	private String communmethod;

	@JsonProperty("commun_address")
	private BigInteger communAddress;
}
