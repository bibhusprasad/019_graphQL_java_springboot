package com.bibhu.graphql.service;

import com.bibhu.graphql.model.BankAccount;
import com.bibhu.graphql.model.Client;
import com.bibhu.graphql.model.Currency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankAccountService {

    public static List<BankAccount> bankAccountList = List.of(
            new BankAccount(001, new Client(100, "Bibhu", "Samal"), Currency.INR, 15485f, "ACTIVE"),
            new BankAccount(002, new Client(200, "Alok", "Dash"), Currency.INR, 205f, "INACTIVE"),
            new BankAccount(003, new Client(300, "John", "Doe"), Currency.USD, 158f, "ACTIVE"),
            new BankAccount(004, new Client(400, "Martin", "Guptil"), Currency.USD, 10f, "INACTIVE"),
            new BankAccount(005, new Client(500, "Jerome", "Nash"), Currency.EUR, 1710f, "ACTIVE"),
            new BankAccount(006, new Client(600, "Sophie", "Julie"), Currency.EUR, 117f, "INACTIVE")
    );

    public BankAccount getBankAccount(int id) {
        return bankAccountList.stream().filter(bankAccount -> bankAccount.getId() == id).findAny().orElse(null);
    }

}
