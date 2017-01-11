package com.greenfox.exams.spring;

import com.greenfox.exams.spring.repositories.WelcomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by rudolfps on 2017.01.11..
 */


@SpringBootApplication
public class SpringexamApplication implements CommandLineRunner {

	@Autowired
	WelcomeRepository welcomeRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringexamApplication.class, args);
	}

		@Override
		public void run (String...args) throws Exception {
			welcomeRepository.deleteAll();

		}
	}
