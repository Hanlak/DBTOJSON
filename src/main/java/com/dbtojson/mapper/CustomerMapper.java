package com.dbtojson.mapper;

import com.dbtojson.dto.AccountDto;
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
		// entity
//    	customer.getAgencyId();
//    	customer.getCity();
//    	customer.getCustomerType();
//    	customer.getHouseNumber();
//    	customer.getId();
//    	customer.getInstitutionId();
//    	customer.getMobile();
//    	customer.getNationality();
//    	customer.getPreferLang();
//    	customer.getRegion();
//    	
//    	//dtos
//        CustomerDto customerDto = new CustomerDto();
//        customerDto.setCommand("Command");
//        customerDto.setCustomerNumber(1223);
//        customerDto.setCustomerCategory(null);
//        customerDto.setCustomerRelation(null);
//        customerDto.setAccountScheme(2323);
//        customerDto.setResident(343);
//        customerDto.setNationality(customer.getNationality());
//        
//        customerDto.setCompany(null);
//        customerDto.setContact(null);
//        customerDto.setAddress(null);
//        customerDto.setContract(null);
//       

		
		return customerDto;
	}
}
