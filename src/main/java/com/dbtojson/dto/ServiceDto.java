package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ServiceDto {

	@JsonProperty("service_object")
    private ServiceObjectDto serviceObject;

}
