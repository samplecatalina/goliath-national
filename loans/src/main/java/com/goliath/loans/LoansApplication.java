package com.goliath.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.goliath.loans.dto.LoansContactInfoDto;

@SpringBootApplication
@EnableDiscoveryClient
/*@ComponentScans({ @ComponentScan("com.goliath.loans.controller") })
@EnableJpaRepositories("com.goliath.loans.repository")
@EntityScan("com.goliath.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {LoansContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "Goliath National Bank Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Madan Reddy",
						email = "tutor@goliath.com",
						url = "https://www.goliath.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.goliath.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Goliath National Bank Loans microservice REST API Documentation",
				url = "https://www.goliath.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
