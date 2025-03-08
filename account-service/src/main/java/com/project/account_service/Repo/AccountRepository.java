package com.project.account_service.Repo;

import com.project.account_service.Model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AccountRepository extends MongoRepository<Account, String> {
    boolean existsByAccountNumber(String accountNumber);
}
