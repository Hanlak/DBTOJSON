package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AccountObjectDto {

	@JsonProperty("account_link_flag")
	private int accountLinkFlag;

}
