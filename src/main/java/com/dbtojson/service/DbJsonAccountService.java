package com.dbtojson.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbtojson.dto.AccountDto;
import com.dbtojson.entity.Account;
import com.dbtojson.mapper.AccountMapper;
import com.dbtojson.respository.DbJsonAccountRepository;

@Service
public class DbJsonAccountService {

	@Autowired
	private final DbJsonAccountRepository dbJsonAccountRepository;

	public DbJsonAccountService(DbJsonAccountRepository dbJsonAccountRepository) {

		this.dbJsonAccountRepository = dbJsonAccountRepository;
	}
	
	public List<AccountDto> findAllAccounts() {
		
		List<Account> accounts = (List<Account>) dbJsonAccountRepository.findAll();
		
		System.out.println(accounts);
		return accounts.stream()
				.map(AccountMapper::toAccountDto)
				.collect(Collectors.toList());
	}
}
