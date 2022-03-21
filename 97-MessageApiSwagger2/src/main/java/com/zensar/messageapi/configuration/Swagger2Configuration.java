package com.zensar.messageapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Configuration {
	
	@Bean
	public Docket getDocket()
	{
		Docket d1=new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths(PathSelectors.ant("/api/**"))//This tell which Url path to be used while creating documentation
														//in this case any controller had api in it's url it will be consider as swagger documentation
					//-->The out will have only message rest controller if(/api/)not given will have message rest controller and message controller
					.apis(RequestHandlerSelectors.basePackage("com.zensar"))//This tells which base package is considered for swagger documentation
					.build();
					
		return d1;
	}
}
