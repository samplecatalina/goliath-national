package com.goliath.accounts;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.goliath.accounts.dto.AccountsContactInfoDto;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
/*@ComponentScans({ @ComponentScan("com.goliath.accounts.controller") })
@EnableJpaRepositories("com.goliath.accounts.repository")
@EntityScan("com.goliath.accounts.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {AccountsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "Goliath National Bank Accounts microservice REST API Documentation",
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
				description =  "Goliath National Bank Accounts microservice REST API Documentation",
				url = "https://www.goliath.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
