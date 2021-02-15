package com.irrt.springdatajpa.repository;

import com.irrt.springdatajpa.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;

public interface PassportRepositiry extends JpaRepository<Passport, Integer> {


    Passport findByNumber(String number);
}
