package com.pibdataviz.api.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.pibdataviz.api", "com.pibdataviz.api.app"})
@EnableJpaRepositories("com.pibdataviz.api")
@EntityScan("com.pibdataviz.api")
public class PibdatavizApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PibdatavizApiApplication.class, args);
	}

}
