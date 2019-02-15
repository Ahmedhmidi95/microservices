package com.if4.pfa.clientsservice;

import com.if4.pfa.clientsservice.entities.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@SpringBootApplication
@EnableEurekaClient
public class ClientsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientsServiceApplication.class, args);
	}
}

@Configuration
class MyConfig extends RepositoryRestConfigurerAdapter {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Client.class);
    }
}
