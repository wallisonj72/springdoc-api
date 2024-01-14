package com.wallison.springdoc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "SpringDoc Project",
                version = "0.1",
                description = "This is Project for learning",
                termsOfService = "Terms here",
                contact = @Contact(
                        name = "Wallison",
                        email = "teste@gmail.com"
                ),
                license = @License(
                        name = "Lincense",
                        url = "www.testespringdoc.com"
                )
        )
)
@SpringBootApplication
public class SpringDocApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDocApplication.class, args);
    }

}
