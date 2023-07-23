package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class MerchantDto {

	@JsonProperty("command")
	private String command;

	@JsonProperty("currentAppStatus")
	private int currentAppStatus;

	@JsonProperty("merchant_number")
	private String merchantNumber;
	
	@JsonProperty("merchant_name")
	private String merchantName;
	
	@JsonProperty("merchant_label")
	private String merchantLabel;
	
	@JsonProperty("merchant_type")
	private String merchantType;
	
	@JsonProperty("mcc")
	private String mcc;
}
