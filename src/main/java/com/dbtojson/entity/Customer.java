package com.dbtojson.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
public class Customer {

	@Id
	//s@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Column(name = "CURR_APP_STATUS")
	private int currentAppStatus;
}