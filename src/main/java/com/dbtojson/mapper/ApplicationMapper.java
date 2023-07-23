package com.dbtojson.mapper;

import com.dbtojson.dto.ApplicationDto;
import com.dbtojson.dto.CustomerDto;
import com.dbtojson.entity.Account;
import com.dbtojson.entity.Customer;
import com.dbtojson.entity.Merchant;

public class ApplicationMapper {
    public static ApplicationDto mapperDto(Customer customer, Merchant merchant, Account account){
        ApplicationDto applicationDto = new ApplicationDto();

        //ApplicationRootElements
        applicationDto.setApplicationType("APTPACQA");
        applicationDto.setApplicationFlowId(2001);
        applicationDto.setApplicationStatus("APST0006");
        applicationDto.setOperatorId("Admin");
        applicationDto.setInstitutionId(customer.getInstitutionId());
        applicationDto.setAgentId(10000001);
        applicationDto.setCustomerType(customer.getCustomerType());
        //Customer Elements
        CustomerDto customerDto = new CustomerDto();
        return applicationDto;
    }
}
