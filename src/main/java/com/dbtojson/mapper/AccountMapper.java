package com.dbtojson.mapper;

import com.dbtojson.dto.AccountDto;
import com.dbtojson.entity.Account;

public class AccountMapper {

	public static AccountDto toAccountDto(Account account) {

		//account.getId();
		
	
		AccountDto accountDto = new AccountDto();
		accountDto.setCommand("account command");
		accountDto.setAccountNumber(account.getAccountNumber());
		accountDto.setCurrency(account.getCurrency());
		accountDto.setAccountType(account.getAccountType());
		
		//AccountObject type
		//accountDto.setAccountObject(null);
		
		
		return accountDto;
	}
}
