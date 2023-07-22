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

	/*
	 * @JsonProperty("command") private String command;
	 * 
	 * @JsonProperty("customer_number") private int customerNumber;
	 * 
	 * @JsonProperty("customer_category") private String customerCategory;
	 * 
	 * @JsonProperty("customer_relation") private String customerRelation;
	 * 
	 * @JsonProperty("account_scheme") private int accountScheme;
	 * 
	 * @JsonProperty("resident") private int resident;
	 * 
	 * @JsonProperty("nationality") private String nationality;
	 * 
	 * //@JsonProperty("company") private CompanyDto company;
	 * 
	 * //@JsonProperty("contact") private ContactDto contact;
	 * 
	 * //@JsonProperty("address") private AddressDto address;
	 * 
	 * //@JsonProperty("contract") private ContractDto contract;
	 */

}