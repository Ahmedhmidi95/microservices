package org.opendevup.societeconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SocieteConfigServiceApplication {

	public static void main(String[] args){
		SpringApplication.run(SocieteConfigServiceApplication.class, args);
	}
}
