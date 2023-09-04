package com.dbtojson.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "agency_info")
public class AgencyInfo {

	@Id
	@Column(name = "profagcode")
	private String profagCode;

	@Column(name = "AGENT_ID")
	private String agentId;

	@Column(name = "CURR_APP_STATUS")
	private Integer currAppStatud;

	@Column(name = "MADE_BY")
	private String madeBy;

	@Column(name = "INSTITUTION_ID")
	private Integer institutionId;

	@Column(name = "BUSNATIONALITY")
	private String nationality;

	@Column(name = "REF_CUST_MOBILE")
	private String refCustMobile;

	@Column(name = "PHYADDR")
	private String phyAddr;


	@Column(name ="REF_CUST_NAME")
	private String refCustName;

	@Column(name= "BUSNAME")
	private String busName;

	@Column(name ="AGEXTN2")
	private String agextn2;



}
