package com.challenge.services.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableSwagger2
public class Swagger2Config  {
	/*
	  extends WebSecurityConfigurerAdapter 
	  private static final String[] AUTH_WHITELIST = {


            // -- swagger ui
            "/swagger-resources/**",
            "/swagger-ui.html",
            "/v2/api-docs",
            "/webjars/**"
    };*/
    
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.host("http://localhost:8080")
        		.select()
            .apis(RequestHandlerSelectors
                .basePackage("com.challenge.services.controller"))
            .paths(PathSelectors.regex("/.*"))
            .build().apiInfo(apiEndPointsInfo());
    }

	    private  ApiInfo apiEndPointsInfo() {
	     	        		  return new ApiInfoBuilder().title("Spring Boot REST API")
	        		            .description("Employee Management REST API")
	        		            .contact(new Contact("Ramesh Fadatare", "www.javaguides.net", "ramesh24fadatare@gmail.com"))
	        		            .license("Apache 2.0")
	        		            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
	        		            .version("1.0.0")
	        		            .build();
	    }
	    
	    
	   /* @Override
		protected void configure(HttpSecurity http) throws Exception {
	    	 http.authorizeRequests()
             .antMatchers(AUTH_WHITELIST).permitAll()*/
             //.antMatchers("/**/*").denyAll();
		//}
}


