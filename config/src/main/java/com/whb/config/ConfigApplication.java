package com.whb.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	public static void main(String[] args) {
		System.out.println("路径："+System.getenv("user.home"));
		SpringApplication.run(ConfigApplication.class, args);

	}

}
