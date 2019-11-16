# Employee Management System with Microservice Architecture
 Graduation Project for Bogazici University - MSc Software Engineering
 
 Project Advisor: [PhD Suzan Üsküdarlı](https://www.cmpe.boun.edu.tr/~uskudarli/)
 
 Reference: [Microservices with Spring Boot and Spring Cloud. From config server to OAuth2 server (without inMemory things) ](https://itnext.io/microservices-with-spring-boot-and-spring-cloud-16d2c056ba12)
 
 # List of Services
 
 config-service is responsible to serve the spring configuration to every service.
 
 registry-service is responsible for the registration and discovery of the other services.
 
 gateway-service is responsible to map the incoming requests to specific microservice.
 
 auth-service is responsible about the authentication and authorization of the requests, storing tokens/refresh tokens and revoking it if needed.
 
 account-service is responsible to create users. 
