package com.dbtojson.mapper;

import com.dbtojson.dto.CustomerDto;
import com.dbtojson.entity.Customer;

public class CustomerMapper {

    public static CustomerDto toCustomerDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustType(customer.getCustomerType());
        customerDto.setNationality(customer.getNationality());
        customerDto.setInstitutionId(customer.getInstitutionId());
        customerDto.setHouseNum(customer.getHouseNumber());
        customerDto.setRegion(customer.getRegion());
        customerDto.setCity(customer.getCity());
        customerDto.setAgencyId(customer.getAgencyId());
        customerDto.setMobile(customer.getMobile());
        customerDto.setPrefLang(customer.getPreferLang());
        return customerDto;
    }
}
