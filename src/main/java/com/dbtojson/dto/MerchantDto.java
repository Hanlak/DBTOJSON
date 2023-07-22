package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MerchantDto {

	@JsonProperty("command")
	private String command;
	
	@JsonProperty("merchant_number")
	private String merchantNumber;
	
	@JsonProperty("merchant_name")
	private String merchantName;
	
	@JsonProperty("merchant_label")
	private String merchantLabel;
	
	@JsonProperty("merchant_type")
	private String merchantType;
	
	@JsonProperty("mcc")
	private int mcc;
	
	//@JsonProperty("contact")
	private ContactDto contact;
	
	//@JsonProperty("address");
	private AddressDto address;
	
	//@JsonProperty("terminal")
	private TerminalDto terminal;
}
