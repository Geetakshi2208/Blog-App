package com.blog.app.apis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;




@Configuration
public class SwaggerConfig {
	
	@Bean
	public OpenAPI customizeOpenAPI() {
	    final String securitySchemeName = "bearerAuth";
	    return new OpenAPI()
	      .addSecurityItem(new SecurityRequirement()
	        .addList(securitySchemeName))
	      .components(new Components()
	        .addSecuritySchemes(securitySchemeName, new SecurityScheme()
	          .name(securitySchemeName)
	          .type(SecurityScheme.Type.HTTP)
	          .scheme("bearer")
	          .bearerFormat("JWT")))
          .info(new Info().title("Blogging Application").version("1.0").description("Blogging App : Backend")
                  .contact(new Contact().name("Geetakshi").url("www.example.com").email("geetakshi2208@gmail.com")));
	    }
	
	
}
