package com.nagarro.jenkins.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Bharath Kalyan S",
                        email = "sbharath25@gmail.com",
                        url = "https://twitter.com/bharathkalyans"
                ),
                description = "OpenApi Documentation for Nagarro Assignment 😄",
                title = "Sample Service for Assignment",
                version = "1.0",
                summary = "Add summary of your Service",

                license = @License(name = "MIT-License")
        ),
        servers = {
                @Server(
                        description = "Local Dev",
                        url = "http://localhost:8081"
                ),
                @Server(
                        description = "Prod Env",
                        url = "http://prod-env:8081"
                )
        }
)
public class OpenApiConfig {
}

