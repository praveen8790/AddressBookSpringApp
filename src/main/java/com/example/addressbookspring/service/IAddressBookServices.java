package com.example.addressbookspring.service;



import com.example.addressbookspring.entity.Person;

import java.util.List;

public interface IAddressBookServices {
    void addToDB(Person person);

    List<Person> get();

    Person updateDB(Integer id, Person person);

    void deleteFromDB(Integer id);
}
