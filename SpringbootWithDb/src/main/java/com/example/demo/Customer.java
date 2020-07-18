package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customer")
public class Customer {
	@Id
	
	public String id;
	public String fistName;
	public String lastName;
	
	public Customer() {}
	public Customer(String id, String fistName, String lastName) {
		super();
		this.id = id;
		this.fistName = fistName;
		this.lastName = lastName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", fistName=" + fistName + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
	

}
