package com.example.ThirdTry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class ThirdTryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThirdTryApplication.class, args);
		
	}

}
