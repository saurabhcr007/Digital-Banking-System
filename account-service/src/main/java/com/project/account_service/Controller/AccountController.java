package com.project.account_service.Controller;

import com.project.account_service.Model.Account;
import com.project.account_service.Model.Transactions;
import com.project.account_service.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/account")
public class AccountController {

    @Autowired
    AccountService accountService;


    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to Account Service";
    }

    public boolean isAccountActive(String accountNumber){
        return true;
    }

    public Boolean CreateAccount(Account account){
        return true;
    }

    public List<String> GetAccountNumber(String userId){
        return null;
    }

    public String GetAccountBalance(String accountNumber){
        return "";
    }

    public Account GetAccountDetails(String accountNumber){
        return null;
    }

    public Transactions GetAccountTransactions(String accountNumber){
        return null;
    }

    public Boolean Deposit(String accountNumber, Double amount){
        return true;
    }

    public Boolean Withdraw(String accountNumber, Double amount){
        return true;
    }

    public Boolean Transfer(String fromAccountNumber, String toAccountNumber, Double amount){
        return true;
    }

    public Account updaterAccount(Account account){
        return null;
    }

    public Boolean deleteAccount(String accountNumber){
        return true;
    }
}