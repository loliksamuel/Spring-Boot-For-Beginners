package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);

	}

	@Profile("prod")
	@Bean
	public String dummy() {
		return "something";
	}
}

/**
userName : user
password : password (or look in log... ex...  96dde417-65ae-42e6-a87b-3a25c4f91c6f)
 http://localhost:8090/welcome
 http://localhost:8090/users/
http://localhost:8090/users/1
 http://localhost:8090/users/?size=2
 http://localhost:8090/users/?page=0&size=2
 http://localhost:8090/users/?page=1&size=2
 http://localhost:8090/users/?page=1&size=2&sort=name&dir=desc
 http://localhost:8090/users/findByRole=user
 http://localhost:8090/surveys
 http://localhost:8090/surveys/Survey1
 http://localhost:8090/surveys/Survey1/questions/
 http://localhost:8090/surveys/Survey1/questions/Question1
 http://localhost:8090/actuator
 http://localhost:8090/metrics
*/