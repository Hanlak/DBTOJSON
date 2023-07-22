package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ServiceObjectDto {

	@JsonProperty("start_date")
    private String startDate;

}
