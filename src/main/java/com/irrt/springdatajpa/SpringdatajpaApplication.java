package com.irrt.springdatajpa;
import com.irrt.springdatajpa.entity.Passport;
import com.irrt.springdatajpa.entity.Person;
import com.irrt.springdatajpa.entity.Phone;
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

		Person anna = new Person("Anna", "Andreeva", "Samara");
		Person olesya = new Person("Olesya", "Andreeva", "Moscow");
//		Person alex = new Person("Alex", "Andreev", "Omsk");

		Passport passportAnna = new Passport("A111111");
		Passport passportOlesya = new Passport("A111112");

		Phone phone1 = new Phone("79776764534");
		Phone phone2 = new Phone("76038726444");
		Phone phone3 = new Phone("78765434567");
		Phone phone4 = new Phone("78876569965");

        anna.setPassport(passportAnna);
        anna.setPhones(Arrays.asList(phone1, phone2));
        olesya.setPassport(passportOlesya);
        olesya.setPhones(Arrays.asList(phone3, phone4));
		List<Person> people = Arrays.asList(anna, olesya);
        personRepository.saveAll(people);

//	System.out.println("<<<<<<<<"+personRepository.findAll());
	}
}