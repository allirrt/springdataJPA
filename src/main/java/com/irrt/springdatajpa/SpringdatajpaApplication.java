package com.irrt.springdatajpa;
import com.irrt.springdatajpa.entity.Person;
import com.irrt.springdatajpa.jdbc.PersonJdbcDao;
import com.irrt.springdatajpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringdataJpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJpaApplication.class, args);
	}

	@Autowired
	PersonRepository personRepository;

	@Override
	public void run(String... args) throws Exception {

//		Person anna = new Person("Anna", "Andreeva", "Samara");
//		Person olesya = new Person("Olesya", "Andreeva", "Moscow");
//		Person alex = new Person("Alex", "Andreev", "Omsk");
//
//		List<Person> people = Arrays.asList(anna, olesya, alex);
//        personRepository.saveAll(people);
//
//	System.out.println("<<<<<<<<"+personRepository.findAll());
	}
}