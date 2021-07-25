package com.example.addressbookspring.repository;


import com.example.addressbookspring.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdressBookRepository extends JpaRepository<Person,Integer> {
}
