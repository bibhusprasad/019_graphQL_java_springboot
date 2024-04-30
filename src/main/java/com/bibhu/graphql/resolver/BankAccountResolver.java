package com.bibhu.graphql.resolver;

import com.bibhu.graphql.model.BankAccount;
import com.bibhu.graphql.model.Client;
import com.bibhu.graphql.service.BankAccountService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class BankAccountResolver implements GraphQLQueryResolver {

    @Autowired
    BankAccountService bankAccountService;

    public BankAccount bankAccount(int id) {
        log.info("Fetching bank account id: {}", id);
        return bankAccountService.getBankAccount(id);
    }

}
