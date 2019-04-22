package com.kosinza.msgproducter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class MsgProducterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsgProducterApplication.class, args);
	}

}
