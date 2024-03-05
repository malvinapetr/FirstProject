package com.digipath.internship.learning.repository;

import com.digipath.internship.learning.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonByFirstName(String fName);

}
