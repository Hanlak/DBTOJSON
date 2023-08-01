package com.dbtojson.respository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbtojson.entity.Customer;

public interface DbJsonCustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByInstitutionId(int institutionId);
}
