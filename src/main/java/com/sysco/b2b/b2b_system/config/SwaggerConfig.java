//package com.sysco.b2b.b2b_system.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import com.google.common.base.Predicates;
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//@EnableSwagger2
//public class SwaggerConfig {
//
//    @Bean
//    public Docket postsApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("public-api")
//                .apiInfo(apiInfo())
//                .select()
//                .paths(Predicates.or(
//                        regex("/api/posts.*"),
//                        regex("/api/comments.*")
//                ))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("SpringMVC Example API")
//                .description("SpringMVC Example API reference for developers")
//                .termsOfServiceUrl("http://hantsy.blogspot.com")
//                .contact("Hantsy Bai")
//                .license("Apache License Version 2.0")
//                .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")
//                .version("2.0")
//                .build();
//    }
//}
