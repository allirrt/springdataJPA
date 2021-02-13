package com.irrt.springdatajpa;
import com.irrt.springdatajpa.entity.Person;
import com.irrt.springdatajpa.jdbc.PersonJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}
	@Autowired
	PersonJdbcDao personJdbcDao;

	@Override
	public void run(String... args) throws Exception {

		Person anna = new Person(100, "Anna", "Andreeva", "Samara");
		Person olesya = new Person(101, "Olesya", "Andreeva", "Moscow");
		Person alex = new Person(102, "Alex", "Andreev", "Omsk");

		personJdbcDao.insert(anna);
		personJdbcDao.insert(olesya);
		personJdbcDao.insert(alex);

		System.out.println("<<<<<<<<"+personJdbcDao.findAll());
	}
}