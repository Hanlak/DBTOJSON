package com.dbtojson.service;

import com.dbtojson.dto.ApplicationDto;
import com.dbtojson.entity.Account;
import com.dbtojson.entity.Customer;
import com.dbtojson.entity.Merchant;
import com.dbtojson.mapper.ApplicationMapper;
import com.dbtojson.respository.DbJsonAccountRepository;
import com.dbtojson.respository.DbJsonCustomerRepository;
import com.dbtojson.respository.DbJsonMerchantRepository;
import com.dbtojson.util.Converter;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DbJsonService {

    @Autowired
    private final DbJsonMerchantRepository dbJsonMerchantRepository;
    @Autowired
    private final DbJsonCustomerRepository dbJsonCustomerRepository;
    @Autowired
    private final DbJsonAccountRepository dbJsonAccountRepository;

    @Autowired
    private final ObjectMapper objectMapper;

    @Autowired
    private final Converter converter;

    public DbJsonService(DbJsonMerchantRepository dbJsonMerchantRepository, DbJsonCustomerRepository dbJsonCustomerRepository, DbJsonAccountRepository dbJsonAccountRepository, ObjectMapper objectMapper, Converter converter) {
        this.dbJsonMerchantRepository = dbJsonMerchantRepository;
        this.dbJsonCustomerRepository = dbJsonCustomerRepository;
        this.dbJsonAccountRepository = dbJsonAccountRepository;
        this.objectMapper = objectMapper;
        this.converter = converter;
    }

    public ApplicationDto getApplicationData(int institutionId) throws JsonProcessingException {

        Customer customer = dbJsonCustomerRepository.findByInstitutionId(institutionId).orElse(new Customer());
        Merchant merchant =
                dbJsonMerchantRepository
                        .findByInstitutionId(institutionId)
                        .orElse(new Merchant());
        Account account = dbJsonAccountRepository.findByInstitutionId(institutionId).orElse(new Account());
        ApplicationDto applicationDto = ApplicationMapper.mapperDto(customer, merchant, account);

        //APPLICATION TO JSON
        Optional<String> objToJson = converter.objToJson(applicationDto);
        if (objToJson.isPresent()) {
            System.out.println("JSON STRING");
            System.out.println(objToJson.get());
            String xmlString = converter.toXML(objToJson.get());
            System.out.println("XML STRING");
            System.out.println(xmlString);
        } else {
            System.out.println("Conversion Failed");
        }
        return applicationDto;

    }

}
