package com.example.addressbookspring.DTO;

import com.example.addressbookspring.entity.Person;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Dto {
    private String _id;

    @NotEmpty(message = "Person name cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message="Person Name Invalid")
    private String _name;

    @Pattern(regexp = "\\d{2}\\d{10}",message = "Invalid Phone Number")
    private String _mobile;

    @NotEmpty(message = "Address cannot be empty")
    private String _address;

    @NotEmpty(message = "State field cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Invalid State")
    private String _state;

    @NotEmpty(message = "City field cannot be empty")
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$",message ="Invalid City")
    private String _city;

    @NotEmpty(message = "PinCode cannot be empty")
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
