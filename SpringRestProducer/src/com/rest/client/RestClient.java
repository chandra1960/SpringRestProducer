package com.rest.client;

import org.springframework.web.client.RestTemplate;

import com.restfull.model.Person;

public class RestClient {
	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
        
	    Person person = restTemplate.getForObject("http://localhost:8080/SpringRestProducer/apple/mac/100", Person.class, 200);
	    
	    System.out.println("ID: " + person.getId());
	    System.out.println("Name: " + person.getName());
	    System.out.println("Village Name: " + person.getAddress().getVillage());
	}

}
