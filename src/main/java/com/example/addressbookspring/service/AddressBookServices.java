package com.example.addressbookspring.service;


import com.example.addressbookspring.entity.Person;
import com.example.addressbookspring.repository.AdressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressBookServices implements IAddressBookServices {
    @Autowired
    private AdressBookRepository adressBookRepository;

    @Override
    public void addToDB(Person person) {
        adressBookRepository.save(person);
    }

    @Override
    public List<Person> get() {
        return adressBookRepository.findAll();
    }

    @Override
    public Person updateDB(Integer id, Person person) {
        return adressBookRepository.findById(id).map(person1 -> {
            person1.setName(person.getName());
            person1.setMobile(person.getMobile());
            person1.setAddress(person.getAddress());
            person1.setState(person.getState());
            person1.setCity(person.getCity());
            person1.setPin(person.getPin());
            return adressBookRepository.save(person1);
        }).get();
    }

    @Override
    public void deleteFromDB(Integer id) {
        adressBookRepository.deleteById(id);
    }
}
