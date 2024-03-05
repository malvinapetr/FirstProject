package com.digipath.internship.learning.facade;

import com.digipath.internship.learning.api.request.LPersonRequest;

public interface LearningFacade {
    String greet();
    String greetFromLF();

    String dataPath(String inputString);

    String dataQuery(Integer num);

    LPersonRequest dataReq(LPersonRequest person);
}
