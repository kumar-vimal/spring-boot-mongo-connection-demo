package com.vimal.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vimal.mongo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,String>{

}
