package com.bibhu.graphql.model;

import lombok.Value;

import java.util.UUID;

@Value
public class BankAccount {
    int id;
    Client client;
    Currency currency;
    float balance;
    String status;
}
