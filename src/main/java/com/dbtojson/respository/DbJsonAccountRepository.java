package com.dbtojson.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbtojson.entity.Account;

@Repository
public interface DbJsonAccountRepository extends CrudRepository<Account, Long>{

}
