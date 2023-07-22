package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ContactDto {

	@JsonProperty("command")
	private String command;
	
	@JsonProperty("contact_type")
	private String contactType;
	
	@JsonProperty("preferred_lang")
	private String preferredLang;
	
	//@JsonProperty("contact")
	private ContactDataDto contactData;
}
