package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerDto {
    @JsonProperty("cust_type")
    private String custType;

    @JsonProperty("nationality")
    private String nationality;

    @JsonProperty("institution_id")
    private int institutionId;

    @JsonProperty("house_num")
    private String houseNum;

    @JsonProperty("region")
    private String region;

    @JsonProperty("city")
    private String city;

    @JsonProperty("agency_id")
    private int agencyId;

    @JsonProperty("mobile")
    private String mobile;

    @JsonProperty("pref_lang")
    private String prefLang;

}