package com.rungroup.websiteexample;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Person {

    @Setter
    private String name;
    @Setter
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
