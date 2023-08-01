package com.dbtojson.mapper;

import com.dbtojson.dto.*;
import com.dbtojson.entity.Account;
import com.dbtojson.entity.Customer;
import com.dbtojson.entity.Merchant;

import javax.xml.crypto.Data;
import java.math.BigInteger;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ApplicationMapper {
    public static Body mapperDto(Customer customer, Merchant merchant, Account account){
        ApplicationDto applicationDto = new ApplicationDto();

        //ApplicationRootElements
        applicationDto.setApplicationType("APTPACQA");
        applicationDto.setApplicationFlowId(2001);
        applicationDto.setApplicationStatus("APST0006");
        applicationDto.setOperatorId("Admin");
        applicationDto.setInstitutionId(customer.getInstitutionId());
        applicationDto.setAgentId(1001);
        applicationDto.setCustomerType(customer.getCustomerType());
        //Customer Elements
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCommand("CMMDCREX");
        customerDto.setCustomerNumber(697);
        customerDto.setCustomerCategory("CCTGORDN");
        customerDto.setCustomerRelation("RSCBEXTR");
        customerDto.setAccountScheme(1);
        customerDto.setResident(1);
        customerDto.setNationality("643");


        //Company
        CompanyDto companyDto = new CompanyDto();
        companyDto.setCommand("CMMDCRUP");
        companyDto.setIncorpForm("INCF0065");
        //company name
        CompanyNameDto companyNameDto = new CompanyNameDto();
        companyNameDto.setCompanyFullName("Food N Drinks Inc");
        companyNameDto.setCompanyShortName("Food N Drinks Incorporation");
        // Company SETUP DONE
        companyDto.setCompanyName(companyNameDto);

        //Contact::
        ContactDto contactDto  = new ContactDto();
        contactDto.setCommand("CMMDCRUP");
        contactDto.setContactType("CNTTPRMC");
        contactDto.setPreferredLang("LANGENG");
        //ContactData
        ContactDataDto contactDataDto = new ContactDataDto();
        contactDataDto.setCommunmethod("CMNM0001");
        BigInteger bigInteger = new BigInteger("4728428779");
        contactDataDto.setCommunAddress(bigInteger);
        //ContactDto Setup
        contactDto.setContactData(contactDataDto);//test with int

        //Address:
        AddressDto addressDto = new AddressDto();
        addressDto.setCommand("Address Command");
        addressDto.setAddressType("Address Type");
        addressDto.setCountry("India");

        //Address Name Dto
        AddressNameDto addressNameDto = new AddressNameDto();
        addressNameDto.setCity("Banglore");
        addressNameDto.setRegion("Bellandur");
        addressNameDto.setStreet("MG road");
        addressDto.setAddressName(addressNameDto);
        addressDto.setHouse("17");
        addressDto.setApartment("Address Apartment");
        addressDto.setPostalCode("22222");

        //Contract
        ContractDto contractDto = new ContractDto();
        contractDto.setCommand("CMMDCREX");
        contractDto.setContractType("CNTPMRCM");
        contractDto.setProductId(1);
        contractDto.setContractNumber(736);
        contractDto.setStartDate(Date.from(Instant.now()));
        //Merchant
        MerchantDto merchantDto = new MerchantDto();
        merchantDto.setCommand("update");
        merchantDto.setMerchantNumber(merchant.getMerchantNumber());///check data type matching?
        merchantDto.setMerchantName(merchant.getMerchantName());
        merchantDto.setMerchantLabel(merchant.getMerchantName());
        merchantDto.setMerchantType(merchant.getMerchantType());
        merchantDto.setMcc(6536);//data  type mismatch for entity and json

        //TODO: contact and address should have a different mapper to pass customer and merchant related info; but for now
        //TODO: setting the common object
        merchantDto.setContact(contactDto);
        merchantDto.setAddress(addressDto);
        //Terminal
        TerminalDto terminalDto = new TerminalDto();
        terminalDto.setCommand("CMMDCREX");
        terminalDto.setTerminalType("TRMT0003");
        terminalDto.setStandardId(1001);
        terminalDto.setVersionId(2301);
        terminalDto.setTerminalTemplate(10000007);
        terminalDto.setDeviceId(10000017);
        terminalDto.setTerminalQuantity(1);

        //terminal Setup
        merchantDto.setTerminal(terminalDto);

        //SERVICE:
        ArrayList<ServiceDto> serviceDtos  = new ArrayList<>();
        ServiceDto serviceDto1 = new ServiceDto();
        ServiceDto serviceDto2 = new ServiceDto();
        ServiceObjectDto serviceObjectDto1 = new ServiceObjectDto();
        serviceObjectDto1.setStartDate("2015-01-13");
        serviceDto1.setServiceObject(serviceObjectDto1);
        ServiceObjectDto serviceObjectDto2 = new ServiceObjectDto();
        serviceObjectDto2.setStartDate("2015-01-14");
        serviceDto2.setServiceObject(serviceObjectDto2);
        serviceDtos.add(serviceDto1);
        serviceDtos.add(serviceDto2);

        //Account:
        AccountDto accountDto = new AccountDto();
        accountDto.setCommand("CMMDCREX");
        accountDto.setAccountNumber("");
        accountDto.setCurrency("643");
        accountDto.setAccountType("ACTP0200");

        AccountObjectDto accountObjectDto =new AccountObjectDto();
        accountObjectDto.setAccountLinkFlag(1);
        accountDto.setAccountObject(accountObjectDto);

        //FINAL SETUP
        contractDto.setAccount(accountDto);
        contractDto.setService(serviceDtos);
        contractDto.setMerchant(merchantDto);

        //CUSTOMER:
        customerDto.setCompany(companyDto);
        customerDto.setContact(contactDto);
        customerDto.setAddress(addressDto);
        customerDto.setContract(contractDto);
        //Application;
        applicationDto.setCustomer(customerDto);
        Body body = new Body();
        body.setApplication(applicationDto);
        return body;
    }
}
