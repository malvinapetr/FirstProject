package com.digipath.internship.learning.facade;

import com.digipath.internship.learning.api.request.PersonRequest;
import com.digipath.internship.learning.api.response.PersonResponse;
import com.digipath.internship.learning.api.response.PersonShortResponse;
import com.digipath.internship.learning.domain.Person;
import com.digipath.internship.learning.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonFacadeImpl implements PersonFacade{
    private final PersonService personService;

    @Override
    public Long create(PersonRequest person) {
        Person p=fromPersonRequestToPerson(person);
        return personService.save(p).getId();
    }

    @Override
    public PersonResponse getData(Long id) {
        Person p = personService.getPersonByID(id);
        if(p!=null) {
            PersonResponse pr = PersonResponse
                    .builder()
                    .id(p.getId())
                    .fName(p.getFirstName())
                    .lName((p.getLastName()))
                    .email(p.getEmail())
                    .age(p.getAge())
                    .ssn(p.getSsn())
                    .build();
            return pr;
        }
        return null;
    }

    @Override
    public List<PersonShortResponse> getAllData() {
        List<Person> p = personService.getPersons();
        return createPersonList(p);
    }

    @Override
    public PersonResponse getSpecificData(String name) {
        Person p = personService.getPersonByName(name);
        if(p!=null) {
            PersonResponse pr = PersonResponse
                    .builder()
                    .id(p.getId())
                    .fName(p.getFirstName())
                    .lName((p.getLastName()))
                    .email(p.getEmail())
                    .age(p.getAge())
                    .ssn(p.getSsn())
                    .build();
            return pr;
        }
        return null;
    }

    private int CalcAge(String ssn){
        return Year.now().getValue()-((Integer.parseInt(Integer.toString(Year.now().getValue()).substring(0, 1))*1000+Integer.parseInt(ssn.substring(4,6))));
    }

    private Person fromPersonRequestToPerson(PersonRequest person){
        int age = CalcAge(person.getSSN());
        Person p= Person
                .builder()
                .firstName(person.getFName())
                .lastName((person.getLName()))
                .email(person.getEmail())
                .age(age)
                .ssn(person.getSSN())
                .build();
        return p;
    }

    private List<PersonShortResponse> createPersonList(List<Person> p){
        List<PersonShortResponse> prList = new ArrayList<>();
        for(Person person:p){
            PersonShortResponse pr= PersonShortResponse
                    .builder()
                    .id(person.getId())
                    .fName(person.getFirstName())
                    .lName((person.getLastName()))
                    .build();
            prList.add(pr);
        }
        return prList;
    }

}
