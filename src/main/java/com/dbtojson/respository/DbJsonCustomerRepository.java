package com.dbtojson.respository;

import com.dbtojson.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DbJsonCustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByInstitutionId(int institutionId);
}
