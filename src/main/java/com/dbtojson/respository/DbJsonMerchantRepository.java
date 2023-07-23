package com.dbtojson.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbtojson.entity.Merchant;

import java.util.Optional;

@Repository
public interface DbJsonMerchantRepository extends JpaRepository<Merchant, Long> {
    Optional<Merchant> findByInstitutionId(int institutionId);

}
