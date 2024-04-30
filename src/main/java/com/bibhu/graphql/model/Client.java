package com.bibhu.graphql.model;

import lombok.Value;

import java.util.UUID;

@Value
public class Client {
    int id;
    String firstName;
    String lastName;
}
