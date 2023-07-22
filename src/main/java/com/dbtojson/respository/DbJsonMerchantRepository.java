package com.dbtojson.respository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbtojson.entity.Merchant;

@Repository
public interface DbJsonMerchantRepository extends CrudRepository<Merchant, Long>{

}
