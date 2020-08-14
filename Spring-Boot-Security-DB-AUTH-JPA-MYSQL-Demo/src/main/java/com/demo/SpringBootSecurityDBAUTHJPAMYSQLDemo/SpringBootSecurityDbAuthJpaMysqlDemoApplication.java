package com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.demo.SpringBootSecurityDBAUTHJPAMYSQLDemo.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringBootSecurityDbAuthJpaMysqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityDbAuthJpaMysqlDemoApplication.class, args);
	}

}
