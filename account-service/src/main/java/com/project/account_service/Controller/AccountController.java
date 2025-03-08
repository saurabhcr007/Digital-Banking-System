package com.project.account_service.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/account")
public class AccountController {

    @GetMapping("/welcome")
    public String Welcome(){
        return "Welcome to Account Service";
    }

}
