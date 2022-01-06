package com.vimal.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.vimal.mongo.repository.EmployeeRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

}
