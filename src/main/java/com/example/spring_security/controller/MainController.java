package com.example.spring_security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public TestDto mainPage(){
        TestDto testDto = new TestDto(1L, "test content", 3);
        return testDto;
    }
}
