package com.digipath.internship.learning.controller;

import com.digipath.internship.learning.api.request.PersonRequest;
import com.digipath.internship.learning.api.response.PersonResponse;
import com.digipath.internship.learning.api.response.PersonShortResponse;
import com.digipath.internship.learning.facade.PersonFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
@Log4j2
public class PersonController {
    private final PersonFacade personFacade;

    @PostMapping
    public Long createPerson(@RequestBody PersonRequest person){
        return personFacade.create(person);
    }

    @GetMapping(path = "/person-data/{id}")
    public PersonResponse getPerson(@PathVariable Long id){
        return personFacade.getData(id);
    }

    @GetMapping
    public List<PersonShortResponse> getPersons(){
        return personFacade.getAllData();
    }

    @GetMapping(path = "/search-person")
    public PersonResponse searchPerson(@RequestParam String name){
        return personFacade.getSpecificData(name);
    }
}
