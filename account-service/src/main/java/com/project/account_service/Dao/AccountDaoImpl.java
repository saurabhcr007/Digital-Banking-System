package com.project.account_service.Dao;

import com.project.account_service.Model.Account;
import com.project.account_service.Repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.ThreadLocalRandom;


public class AccountDaoImpl implements AccountDao {

    @Autowired
    AccountRepository accountRepository;

    public void setAccountNumber(Account account) {
        if (account.getAccountNumber() == null || account.getAccountNumber().isEmpty()) {
            String accountNumber;
            do {
                accountNumber = String.format("%012d", ThreadLocalRandom.current().nextLong(100_000_000_000L, 1_000_000_000_000L));
            } while (accountRepository.existsByAccountNumber(accountNumber)); // Ensure uniqueness
            account.setAccountNumber(accountNumber);
        }
    }
}
