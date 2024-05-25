# Graphql

## pom.xml file

````xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>com.graphql-java-kickstart</groupId>
			<artifactId>graphql-spring-boot-starter</artifactId>
			<version>15.1.0</version>
		</dependency>
		<dependency>
			<groupId>com.graphql-java-kickstart</groupId>
			<artifactId>playground-spring-boot-starter</artifactId>
			<version>11.1.0</version>
		</dependency>
		<dependency>
			<groupId>io.projectreactor</groupId>
			<artifactId>reactor-core</artifactId>
		</dependency>
		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>
	</dependencies>
````

## application.yml

````yaml
spring:
  application:
    name: graphql

server:
  http2:
    enabled: true

logging:
  level:
    root: info

graphql:
  playground:
    enabled: true
    tabs:
      - name: Bank account simple query
        query: classpath:playground/bank_account.graphqls
        variables: classpath:playground/bank_account_variables.json
  servlet:
    exception-handlers-enabled: true
    max-query-depth: 5

````

## URL to hit from Graphql Playground Browser

### Hit in browser URL

http://localhost:8080/playground

URL to hit
http://localhost:8080/graphql

Request Parameter

````graphql
{
  bankAccount(id: "003") {
    id
    client {
      id
      firstName
      lastName
    }
    currency
    balance
    status
  }
}
````

Response Data

````json
{
  "data": {
    "bankAccount": {
      "id": "3",
      "client": {
        "id": "300",
        "firstName": "John",
        "lastName": "Doe"
      },
      "currency": "USD",
      "balance": 158.0,
      "status": "ACTIVE"
    }
  }
}
````

### URL to hit from Graphql Playground Insomnia Client API

GraphQL request

http://localhost:8080/graphql

Request Parameter

````graphql
{
  bankAccount(id: "003") {
    id
    client {
      id
      firstName
      lastName
    }
    currency
    balance
    status
  }
}
````

Response Data

````json
{
  "data": {
    "bankAccount": {
      "id": "3",
      "client": {
        "id": "300",
        "firstName": "John",
        "lastName": "Doe"
      },
      "currency": "USD",
      "balance": 158.0,
      "status": "ACTIVE"
    }
  }
}
````
