package com.digipath.internship.learning.facade;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LearningFacadeImpl implements LearningFacade {
    @Override
    public String greet() {
        return "Empty greeting";
    }
}
