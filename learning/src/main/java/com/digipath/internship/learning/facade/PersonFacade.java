package com.digipath.internship.learning.facade;

import com.digipath.internship.learning.api.request.PersonRequest;
import com.digipath.internship.learning.api.response.PersonResponse;
import com.digipath.internship.learning.api.response.PersonShortResponse;

import java.util.List;

public interface PersonFacade {

    Long create(PersonRequest person);

    PersonResponse getData(Long id);

    List<PersonShortResponse> getAllData();

    PersonResponse getSpecificData(String name);
}
