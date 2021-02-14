package com.irrt.springdatajpa.repository;

import com.irrt.springdatajpa.entity.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class PersonRepositoryTest {
@Autowired
    PersonRepository personRepository;
    @Test
    void findByFirstName() throws Exception{
        List<Person> people = personRepository.findByFirstName("Anna");
    assertThat(people).hasSize(1);
    assertThat(people.get(0).getLastName()).isEqualTo("Andreeva");
    }
    @Test
    void findAllOrderedByFirstName() throws Exception{
        List<Person> people = personRepository.findAllOrderedByFirstName();
        assertThat(people).hasSize(3);
        assertThat(people.get(2).getFirstName()).isEqualTo("Olesya");
        assertThat(people.get(1).getFirstName()).isEqualTo("Anna");

    }
}