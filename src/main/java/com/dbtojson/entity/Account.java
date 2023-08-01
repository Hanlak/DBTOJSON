package com.dbtojson.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "account")
@Data
public class Account {

    @javax.persistence.Id
  //  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(name = "CURR_APP_STATUS")
    private int currAppStatus;

    @Column(name = "INSTITUTION_ID")
    private int institutionId;

    @Column(name = "ACC_NUM")
    private String accountNumber;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "ACCCTYPE")
    private String accountType;
}

