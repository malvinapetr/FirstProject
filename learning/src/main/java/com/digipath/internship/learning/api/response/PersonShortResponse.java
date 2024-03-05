package com.digipath.internship.learning.api.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class PersonShortResponse {
    private Long id;
    private String fName;
    private String lName;
}
