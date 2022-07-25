package com.db.betriebsstellen.BetriebsstellenAPI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Class for API documentation with Swagger. Based on Udacity
 * online course <a href="https://gitlab.com/videolearning/udacity-java/tree/master/Lesson7-documenting">...</a> .
 * Instantiates Swagger tool for the entire API, enables overwriting of response messages.
 * Provides general descriptive information about the API.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Betriebsstellen API")
                .description("This API returns information about a Betriebsstelle based on its abbreviation.")
                .version("1.0")
                .contact(new Contact("Laura", "https://github.com/Laura477", "laura.mey@rwth-aachen.de"))
                .build();
    }

}


