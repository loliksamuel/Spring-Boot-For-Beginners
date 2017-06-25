package com.in28minutes.springboot.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {

	private static final Logger log = LoggerFactory
			.getLogger(UserCommandLineRunner.class);

	@Autowired
	private UserRepository repository;

	@Override
	public void run(String... args) throws Exception {

		repository.save(new User("Samuel"	, "Admin"));
		repository.save(new User("Joe dog"  , "User"));
		repository.save(new User("Anastasia", "Admin"));
		repository.save(new User("Shai kar"	, "User"));
		log.info("all users are.....");
		for (User user : repository.findAll()) {
			log.info(user.toString());
		}

		log.info("Admin users are.....");
		log.info("____________________");
		for (User user : repository.findByRole("Admin")) {
			log.info(user.toString());
		}

	}

}
