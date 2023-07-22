package com.dbtojson.mapper;

import java.util.ArrayList;

import com.dbtojson.dto.AccountDto;
import com.dbtojson.dto.AccountObjectDto;
import com.dbtojson.dto.AddressDto;
import com.dbtojson.dto.AddressNameDto;
import com.dbtojson.dto.ContactDataDto;
import com.dbtojson.dto.ContactDto;
import com.dbtojson.dto.MerchantDto;
import com.dbtojson.dto.ServiceDto;
import com.dbtojson.dto.ServiceObjectDto;
import com.dbtojson.dto.TerminalDto;
import com.dbtojson.entity.Merchant;

public class MerchantMapper {

	public static MerchantDto toMerchantDto(Merchant merchant) {

		// entity getters
		merchant.getId();
		merchant.getMcc();
		merchant.getMerchantName();
		merchant.getMerchantNumber();
		merchant.getMerchantType();

		// dtos setters
		MerchantDto merchantDto = new MerchantDto();
		merchantDto.setCommand("Merchant command");
		merchantDto.setMerchantNumber(merchant.getMerchantNumber());
		merchantDto.setMerchantLabel("Merchant Label");
		merchantDto.setMerchantType(merchant.getMerchantType());
		merchantDto.setMcc(231321);

		// Account
		AccountDto accountDto = new AccountDto();
		accountDto.setCommand("Account Command");
		accountDto.setAccountNumber("Accoun Number");
		accountDto.setCurrency("currency");
		accountDto.setAccountType("34243");
		AccountObjectDto accountObjectDto = new AccountObjectDto();
		accountObjectDto.setAccountLinkFlag(2312);
		accountDto.setAccountObject(accountObjectDto);

		// service
		ServiceDto serviceDto = new ServiceDto();
		ServiceObjectDto serviceObjectDto = new ServiceObjectDto();
		serviceObjectDto.setStartDate("21-03-1994");
		serviceDto.setServiceObject(serviceObjectDto);
		ServiceObjectDto serviceObjectDto2 = new ServiceObjectDto();
		ServiceDto serviceDto2 = new ServiceDto();
		serviceObjectDto2.setStartDate("09-11-2000");
		serviceDto2.setServiceObject(serviceObjectDto2);
		ArrayList<ServiceDto> serviceList = new ArrayList<ServiceDto>();
		serviceList.add(serviceDto);
		serviceList.add(serviceDto2);

		// address
		AddressDto addressDto = new AddressDto();
		addressDto.setCommand("Address Command");
		addressDto.setAddressType("Address Type");
		addressDto.setCountry("India");
		addressDto.setApartment("Address Apartment");
		addressDto.setPostalCode("22222");

		AddressNameDto addressNameDto = new AddressNameDto();
		addressNameDto.setCity("Banglore");
		addressNameDto.setRegion("Bellandur");
		addressNameDto.setStreet("MG road");
		addressDto.setAddressName(addressNameDto);
		merchantDto.setAddress(addressDto);

		// contact
		ContactDto contactDto = new ContactDto();
		contactDto.setCommand("Contact Command");
		contactDto.setContactType("Contact Type");
		ContactDataDto contactDataDto = new ContactDataDto();
		contactDataDto.setCommunAddress("Banglore");
		contactDataDto.setCommunmethod("Transport");
		contactDto.setPreferredLang("English");
		contactDto.setContactData(contactDataDto);
		merchantDto.setContact(contactDto);

		// Terminal
		TerminalDto terminalDto = new TerminalDto();
		terminalDto.setCommand("Terminal Command");
		terminalDto.setTerminalType("terminal_type");
		terminalDto.setStandardId(122);
		terminalDto.setTerminalTemplate(32423);
		terminalDto.setDeviceId("3434");
		terminalDto.setTerminalType("Test Terminal");

		merchantDto.setTerminal(terminalDto);

		return merchantDto;
	}
}
