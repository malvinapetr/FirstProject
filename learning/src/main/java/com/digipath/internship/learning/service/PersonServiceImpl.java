package com.digipath.internship.learning.service;

import com.digipath.internship.learning.domain.Person;
import com.digipath.internship.learning.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

    private final PersonRepository personRepository;
    @Override
    public Person save(Person p) {
        return personRepository.save(p);
    }

    @Override
    public Person getPersonByID(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    @Override
    public List<Person> getPersons() {
        return personRepository.findAll();
    }

    @Override
    public Person getPersonByName(String name) {
        return personRepository.findPersonByFirstName(name);
    }
}
