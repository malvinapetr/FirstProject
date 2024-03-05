package com.digipath.internship.learning.facade;

import com.digipath.internship.learning.api.request.PersonRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LearningFacadeImpl implements LearningFacade {
    @Override
    public String greet() {
        return "Empty greeting";
    }

    @Override
    public String greetFromLF(){ return "Greetings from learning controller";}

    @Override
    public String dataPath(String inputString) {
        return inputString + "!!!!!!";
    }

    @Override
    public String dataQuery(Integer num) {
        return "The number is: " + num;
    }

    @Override
    public PersonRequest dataReq(PersonRequest person) {
        person.setName("Name 2");
        return person;
    }
}
