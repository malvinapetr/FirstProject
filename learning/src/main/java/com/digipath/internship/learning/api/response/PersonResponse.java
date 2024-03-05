package com.digipath.internship.learning.api.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PersonResponse {
    private Long id;
    private String fName;
    private String lName;
    private String email;
    private int age;
    private String ssn;
}
