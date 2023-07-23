package com.dbtojson.respository;

import com.dbtojson.entity.Account;
import com.dbtojson.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DbJsonAccountRepository extends JpaRepository<Account,Long> {
    Optional<Account> findByInstitutionId(int institutionId);

}
