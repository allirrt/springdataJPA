package com.irrt.springdatajpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
     private int id;

     private String firstName;
     private String lastName;
     private String address;


     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "passport_id")
     private Passport passport;

     //однонаправленная
     @OneToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     @JoinColumn(name = "person_id")
     private List<Phone> phones;

     //двунаправленная
     @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
     private List<Address> addresses;

    public Person() {
    }

    public Person(String firstName, String lastName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public Person(int id, String firstName, String lastName, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(addresses !=null){
            addresses.forEach(a->{
                a.setPerson(this);
            });
        }
        this.address = address;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", passport=" + passport +
                '}';
    }
}
