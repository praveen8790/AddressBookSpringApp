package com.example.addressbookspring.DTO;

import com.example.addressbookspring.entity.Person;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Dto {
    private String _id;
    private String _name;
    private String _mobile;
    private String _address;
    private String _state;
    private String _city;
    private String _pin;

    public Dto(Person person) {
        this._id = person.getId().toString();
        this._name= person.getName();
        this._mobile= person.getMobile();
        this._address= person.getAddress();
        this._state= person.getState();
        this._city= person.getCity();
        this._pin= person.getPin();
    }

    public Dto() {

    }


    public void setId(String id) {
        this._id = id;
    }

    @Id
    public String getId() {
        return _id;
    }
}
