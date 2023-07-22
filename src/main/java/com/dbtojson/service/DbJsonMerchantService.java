package com.dbtojson.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbtojson.dto.MerchantDto;
import com.dbtojson.entity.Merchant;
import com.dbtojson.mapper.MerchantMapper;
import com.dbtojson.respository.DbJsonMerchantRepository;

@Service
public class DbJsonMerchantService {

	@Autowired
	private final DbJsonMerchantRepository dbJsonMerchantRepository;

	public DbJsonMerchantService(DbJsonMerchantRepository dbJsonMerchantRepository) {
		this.dbJsonMerchantRepository = dbJsonMerchantRepository;
	}

	public List<MerchantDto> findAllMerchants() {

		List<Merchant> merchants = (List<Merchant>) dbJsonMerchantRepository.findAll();

		System.out.println(merchants);
		return merchants.stream()
				.map(MerchantMapper::toMerchantDto)
				.collect(Collectors.toList());
	}
}
