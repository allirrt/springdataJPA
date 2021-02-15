package com.irrt.springdatajpa;

import com.irrt.springdatajpa.entity.Person;
import com.irrt.springdatajpa.repository.PersonRepository;
import org.hibernate.LazyInitializationException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationsTest {
@Autowired
   PersonRepository personRepository;
    @Test(expected = LazyInitializationException.class)
    public void lazyLoadingExeotion() throws Exception{
        List<Person> anna = personRepository.findByFirstName("Anna");
        System.out.println(anna.get(0).getPhones());
    }
    @Test
    @Transactional
    public void lazyLoadingTransactional() throws Exception{
        List<Person> anna = personRepository.findByFirstName("Anna");
        System.out.println(anna.get(0).getPhones());
    }
}
