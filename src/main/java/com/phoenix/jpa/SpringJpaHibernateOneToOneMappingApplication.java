package com.phoenix.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.phoenix.jpa.springjpahibernatemapping.repository")
@SpringBootApplication
public class SpringJpaHibernateOneToOneMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHibernateOneToOneMappingApplication.class, args);
	}
}
