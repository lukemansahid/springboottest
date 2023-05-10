package com.lukeman.mySpringBootCrudApi.Config;

import org.hibernate.annotations.Comment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;


//@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
               .select()
                .apis(RequestHandlerSelectors.basePackage("com.lukeman.mySpringBootCrudApi"))
                .paths(regex("/api.*"))
                .build()
                .apiInfo(metaInfo());
    }

    private ApiInfo metaInfo(){

        ApiInfo apiInfo = new ApiInfo(
                " My Spring Boot CRUD Api",
                "Spring Boot Swagger ",
                "1.0",
                "Terms of Service",
                new Contact("Lukeman S. Kamara","https://github.com/lukemansahid/",
                        "lukemansahid@gmail.com"),
                "Apache License Version 2.0",
                ""
        );
        return apiInfo;
    }
}
