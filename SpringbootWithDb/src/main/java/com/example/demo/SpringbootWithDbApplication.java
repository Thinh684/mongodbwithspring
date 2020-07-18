package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootWithDbApplication implements CommandLineRunner {
	@Autowired
	private CustomerRepository customerRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWithDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer c1 = new Customer("1","Thịnh","Lê");
		Customer c2 = new Customer("2","Tiến","Đức");
		Customer c3 = new Customer("3","Chiến","Nguyễn");

		customerRepository.save(c1);
		customerRepository.save(c2);
		customerRepository.save(c3);
		
		System.out.println("********************");
		
		List<Customer> customers =  customerRepository.findAll();
		for (Customer c: customers) {
			System.out.println(c.toString());
			
		}
//		 System.out.println("Customer found with findByFirstName('Thịnh'):");
//		    System.out.println("--------------------------------");
//		    System.out.println(customerRepository.findByFirstName("Thịnh"));
//
//		    System.out.println("Customers found with findByLastName('Lê'):");
//		    System.out.println("--------------------------------");
//		    for (Customer c : customerRepository.findByLastName("Lê")) {
//		      System.out.println(c);
//		    }
//		
	}

}
