package com.cjc.main.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RahulEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RahulEurekaServerApplication.class, args);
	}

}
