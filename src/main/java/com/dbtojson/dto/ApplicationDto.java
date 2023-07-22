package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ApplicationDto {

	@JsonProperty("application_type")
	private String applicationType;
	
	@JsonProperty("application_flow_id")
	private int applicationFlowId;
	
	@JsonProperty("application_status")
	private String applicationStatus;
	
	@JsonProperty("operator_id")
	private String operatorId;
	
	@JsonProperty("institution_id")
	private int institutionId;
	
	@JsonProperty("agent_id")
	private int agentId;
	
	@JsonProperty("customer_type")
	private String customerType;
	
	//@JsonProperty("customer")
	private CustomerDto customer;
}
