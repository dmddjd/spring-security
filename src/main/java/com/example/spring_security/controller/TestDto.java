package com.example.spring_security.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TestDto {

    private Long id;
    private String content;
    private Integer count;

    public TestDto(long l, String testContent, int i) {
        this.id = l;
        content = testContent;
        count = i;
    }
}
