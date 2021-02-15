package com.irrt.springdatajpa;


import com.irrt.springdatajpa.entity.Address;
import com.irrt.springdatajpa.entity.Person;
import com.irrt.springdatajpa.repository.PersonRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OwnerRelationTest {
    @Autowired
    PersonRepository personRepository

    public void inverseEndTest() throws Exception{
        List<Person> people = personRepository.findByFirstName("Anna");
        Person anna = people.get(0);
        anna.setLastName("Petrova");
        anna.setAddress(Arrays.asList(new Address("Zima")));
  personRepository.save(anna);
    }
}

