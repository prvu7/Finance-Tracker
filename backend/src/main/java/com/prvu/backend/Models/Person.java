package com.prvu.backend.Models;

import lombok.Getter;
import lombok.Setter;

public class Person {
    @Getter@Setter
    private String firstName;
    @Getter@Setter
    private String lastName;
    @Getter@Setter
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
