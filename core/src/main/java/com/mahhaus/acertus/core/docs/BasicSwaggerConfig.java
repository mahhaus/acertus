package com.mahhaus.acertus.core.docs;


import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author josias on 06/05/19
 */
public class BasicSwaggerConfig {

    private final String basePackage;

    public BasicSwaggerConfig(String basePackage) {
        this.basePackage = basePackage;
    }

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(basePackage))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("ACERTUS your new way to save notes in your travel.")
                .version("1.0")
                .contact(new Contact("Josias Soares", "Http://mahhaus.com", "mahhasus@gmail.com"))
                .license("Private stuff bro, belongs to Mahhaus Solutions")
                .licenseUrl("http://devdojo.academy")
                .build();
    }
}
