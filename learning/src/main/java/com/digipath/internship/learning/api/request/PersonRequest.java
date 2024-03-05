package com.digipath.internship.learning.api.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest {
    private String fName;
    private String lName;
    private String email;
    private String SSN;
}