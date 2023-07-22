package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class IdentityCardDto {

	@JsonProperty("command")
	private String command;

	@JsonProperty("id_type")
	private String idType;

	@JsonProperty("id_number")
	private int idNumber;
}
