package com.example.addressbookspring.controller;


import com.example.addressbookspring.DTO.Dto;
import com.example.addressbookspring.entity.Person;
import com.example.addressbookspring.service.IAddressBookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(allowedHeaders = "*",methods = {RequestMethod.DELETE,RequestMethod.PUT,RequestMethod.GET,
        RequestMethod.OPTIONS,RequestMethod.HEAD,RequestMethod.POST},origins = "*")
@RestController
@RequestMapping("/AddressBookDB")
public class AddressBookController {
    @Autowired
    private IAddressBookServices addressBookServices;
    @PostMapping
    public ResponseEntity add(@RequestBody Dto dto){
        addressBookServices.addToDB(new Person(dto));
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@PathVariable Integer id, @RequestBody Dto dto){
        return new ResponseEntity<>(addressBookServices.updateDB(id,new Person(dto)),HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        addressBookServices.deleteFromDB(id);
        return ResponseEntity
                .ok()
                .allow(HttpMethod.GET, HttpMethod.DELETE, HttpMethod.PUT, HttpMethod.OPTIONS)
                .build();
    }

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<Dto>> getPersons(){
        return new ResponseEntity<List<Dto>>(addressBookServices.get().stream().map(person -> {
            return new Dto(person);
        }).collect(Collectors.toList()), HttpStatus.ACCEPTED);
    }


}
