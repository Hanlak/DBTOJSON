package com.dbtojson.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CustomerDto {

    @JsonProperty("command")
    private String command;

    @JsonProperty("customer_number")
    private int customerNumber;

    @JsonProperty("customer_category")
    private String customerCategory;
    @JsonProperty("customer_relation")
    private String customerRelation;
    @JsonProperty("account_scheme")
    private int accountScheme;
    @JsonProperty("resident")
    private int resident;
    @JsonProperty("nationality")
    private String nationality;
    @JsonProperty("company")
    private CompanyDto company;
    @JsonProperty("contact")
    private ContactDto contact;
    @JsonProperty("address")
    private AddressDto address;
    @JsonProperty("contract")
    private ContractDto contract;


}