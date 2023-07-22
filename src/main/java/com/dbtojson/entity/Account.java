package com.dbtojson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="account")
@Data
public class Account {

	
	@Id
	@Column(name = "Id")
	private int Id;

	@Column(name = "ACC_NUM")
	private String accountNumber;

	@Column(name = "CURRENCY")
	private String currency;

	@Column(name = "ACCCTYPE")
	private String accountType;
}
