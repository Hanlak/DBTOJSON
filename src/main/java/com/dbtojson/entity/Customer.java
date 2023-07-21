package com.dbtojson.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "CUST_TYPE")
    private String customerType;
    @Column(name = "NATIONALITY")
    private String nationality;
    @Column(name = "INSTITUTION_ID")
    private int institutionId;
    @Column(name = "HOUSE_NUM")
    private String HouseNumber;
    @Column(name = "REGION")
    private String region;
    @Column(name = "CITY")
    private String city;
    @Column(name = "AGENCY_ID")
    private int agencyId;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "PREF_LANG")
    private String preferLang;
}