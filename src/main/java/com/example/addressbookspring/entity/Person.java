package com.example.addressbookspring.entity;

import com.example.addressbookspring.DTO.Dto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Person {

    private Integer id;
    private String name;
    private String mobile;
    private String address;
    private String state;
    private String city;
    private String pin;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }


    public Person(Dto dto){
        this.id= Integer.valueOf(dto.getId());
        this.name = dto.get_name();
        this.mobile = dto.get_mobile();
        this.address = dto.get_address();
        this.state = dto.get_state();
        this.city = dto.get_city();
        this.pin = dto.get_pin();
    }
}
