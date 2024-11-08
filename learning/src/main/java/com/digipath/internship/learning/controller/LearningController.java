package com.digipath.internship.learning.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;
import com.digipath.internship.learning.api.request.PersonRequest;
import com.digipath.internship.learning.facade.LearningFacade;

@CrossOrigin
@RestController
@RequestMapping("/api/learning")
@RequiredArgsConstructor
@Log4j2
public class LearningController {

    private final LearningFacade learningFacade;

    @GetMapping
    public String emptyGreeting(){
        return learningFacade.greet();
    }

    @GetMapping(path = "/greeting")
    public String greeting(){
        return "Greetings from learning controller";
    }

    //Path Variable
    @GetMapping(path = "/data/path-var/{inputString}")
    public String dataPathVar(@PathVariable String inputString){
        return inputString + "!!!!!!";
    }

    //Query Parameter
    @GetMapping(path = "/data/query-param")
    public String dataQueryParam(@RequestParam(required = false, defaultValue = "10") Integer num){
        return "The number is: " + num;
    }

    //Request Body
    @PostMapping(path = "/data/req-body")
    public PersonRequest dataReqBody(@RequestBody PersonRequest person){
        person.setName("Name 2");
        return person;
    }
}
