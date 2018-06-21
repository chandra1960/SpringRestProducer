package com.restful.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restfull.model.Address;
import com.restfull.model.Person;

@RestController
@RequestMapping("/apple")
public class PersonController {
@RequestMapping(value= "/mac/{id}",
produces = MediaType.APPLICATION_JSON_VALUE)
public Person getPersonDetails(@PathVariable(value = "id") Integer id) {

    Address address = new Address("Hyderabad","Karnataka", "Telangana");
    return new Person(id,"Chandra", address);
} 
}