package com.vimal.mongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "test")
public class Employee {
	private String name;
	private int age;
	private String email;
	private String status;
	
	public Employee(String name, int age, String email, String status) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getstatus() {
		return status;
	}
	public void setstatus(String status) {
		this.status = status;
	}
}
