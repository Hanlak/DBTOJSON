package com.dbtojson.service;

import com.dbtojson.dto.CustomerDto;
import com.dbtojson.entity.Customer;
import com.dbtojson.mapper.CustomerMapper;
import com.dbtojson.respository.DbJsonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DbJsonService {
    private final DbJsonRepository dbJsonRepository;

    @Autowired
    public DbJsonService(DbJsonRepository dbJsonRepository) {
        this.dbJsonRepository = dbJsonRepository;
    }
    public List<CustomerDto> findAllCustomers() {
        List<Customer> customers = (List<Customer>) dbJsonRepository.findAll();
        System.out.println(customers);
        return customers.stream()
                .map(CustomerMapper::toCustomerDto)
                .collect(Collectors.toList());
    }
}
