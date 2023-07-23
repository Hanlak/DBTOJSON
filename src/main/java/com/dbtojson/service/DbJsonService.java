package com.dbtojson.service;

import com.dbtojson.entity.Account;
import com.dbtojson.entity.Customer;
import com.dbtojson.mapper.MerchantMapper;
import com.dbtojson.respository.DbJsonAccountRepository;
import com.dbtojson.respository.DbJsonCustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbtojson.dto.MerchantDto;
import com.dbtojson.entity.Merchant;
import com.dbtojson.respository.DbJsonMerchantRepository;

import javax.persistence.EntityNotFoundException;

@Service
public class DbJsonService {

	@Autowired
	private final DbJsonMerchantRepository dbJsonMerchantRepository;
	@Autowired
	private final DbJsonCustomerRepository dbJsonCustomerRepository;
	@Autowired
	private final DbJsonAccountRepository dbJsonAccountRepository;
	public DbJsonService(DbJsonMerchantRepository dbJsonMerchantRepository, DbJsonCustomerRepository dbJsonCustomerRepository, DbJsonAccountRepository dbJsonAccountRepository) {
		this.dbJsonMerchantRepository = dbJsonMerchantRepository;
		this.dbJsonCustomerRepository = dbJsonCustomerRepository;
		this.dbJsonAccountRepository = dbJsonAccountRepository;
	}

	public MerchantDto getData(int institutionId){

		Customer customer = dbJsonCustomerRepository.findByInstitutionId(institutionId).orElse(new Customer());
		Merchant merchant =
				dbJsonMerchantRepository
						.findByInstitutionId(institutionId)
						.orElse(new Merchant());
		Account account = dbJsonAccountRepository.findByInstitutionId(institutionId).orElse(new Account());
		System.out.println(customer.toString() + "== \n"+ account.toString() );
		return MerchantMapper.mapToDto(merchant);
	}

}
