package com.digipath.internship.learning.facade;

import com.digipath.internship.learning.api.request.PersonRequest;

public interface LearningFacade {
    String greet();
    String greetFromLF();

    String dataPath(String inputString);

    String dataQuery(Integer num);

    PersonRequest dataReq(PersonRequest person);
}
