package com.if4.pfa.comptesservice;

import com.if4.pfa.comptesservice.entities.Compte;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@EnableEurekaClient
@SpringBootApplication
public class ComptesServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ComptesServiceApplication.class, args);
	}
}

@Configuration
class MyConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Compte.class);
    }
}