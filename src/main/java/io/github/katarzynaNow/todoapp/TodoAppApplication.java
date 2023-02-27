package io.github.katarzynaNow.todoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
public class TodoAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(TodoAppApplication.class, args);
	}
	@Bean
	LocalValidatorFactoryBean validator(){
		return new LocalValidatorFactoryBean();
	}

}
