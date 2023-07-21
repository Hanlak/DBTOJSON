package com.dbtojson.respository;

import com.dbtojson.entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DbJsonRepository extends CrudRepository<Customer, Long> {
}
