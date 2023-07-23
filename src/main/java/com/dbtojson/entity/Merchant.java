package com.dbtojson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "merchant")
@Data
public class Merchant {

	@Id
	@Column(name = "Id")
	private int Id;

	@Column(name = "CURR_APP_STATUS")
	private int currentAppStatus;

	@Column(name = "MERCH_ID")
	private String merchantNumber;

	@Column(name = "MERCH_NAME")
	private String merchantName;

	@Column(name = "MERCH_TYPE")
	private String merchantType;

	@Column(name = "MERCH_CODE")
	private String mcc;

	@Column(name = "INSTITUTION_ID")
	private int institutionId;
}
