package com.digipath.internship.learning.service;

import com.digipath.internship.learning.domain.Person;

import java.util.List;

public interface PersonService {

    Person save(Person p);

    Person getPersonByID(Long id);

    List<Person> getPersons();

    Person getPersonByName(String name);
}
