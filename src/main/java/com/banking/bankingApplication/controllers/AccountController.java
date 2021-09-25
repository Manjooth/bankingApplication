/* (C)2021 */
package com.banking.bankingApplication.controllers;

import com.banking.bankingApplication.models.Account;
import com.banking.bankingApplication.repositories.AccountRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
// @RequestMapping(path = "/account")
public class AccountController {

    private List<Account> allAccounts;

    @Autowired AccountRepository accountRepository;

    @GetMapping(path = "/accounts")
    //    @ResponseBody
    public String getAllAccounts(Model model) {
        model.addAttribute("accounts", accountRepository.findAll());
        return "accounts";
    }

    @GetMapping(path = "/getByAccountId/{accountId}")
    @ResponseBody
    public Optional<Account> getByAccountId(@PathVariable String accountId) {
        return accountRepository.findById(accountId);
    }

    @GetMapping(path = "/getByAccountType/{accountType}")
    @ResponseBody
    public List<Account> getByAccountType(@PathVariable String accountType) {
        allAccounts = accountRepository.findAll();
        return allAccounts.stream()
                .filter(account -> account.getAtype().equals(accountType))
                .collect(Collectors.toList());
    }

    @GetMapping(path = "/getByAccountStatus/{accountStatus}")
    @ResponseBody
    public List<Account> getByAccountStatus(@PathVariable String accountStatus) {
        allAccounts = accountRepository.findAll();
        return allAccounts.stream()
                .filter(account -> account.getAstatus().equals(accountStatus))
                .collect(Collectors.toList());
    }
}
