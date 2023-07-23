package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class TerminalDto {

	@JsonProperty("command")
	private String command;

	@JsonProperty("terminal_type")
	private String terminalType;

	@JsonProperty("standard_id")
	private int standardId;

	@JsonProperty("version_id")
	private int versionId;

	@JsonProperty("terminal_template")
	private int terminalTemplate;

	@JsonProperty("device_id")
	private int deviceId;

	@JsonProperty("terminal_quantity")
	private int terminalQuantity;
}
