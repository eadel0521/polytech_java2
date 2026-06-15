package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonTest {


    @Test
    @DisplayName("age equals to current year minus birth year")
    void getAge_cal() {
        // given
        int birthYear = 2000;
        Person person = new Person("Joon", birthYear);
        int thisYear = LocalDate.now().getYear();

        // when
        int age = person.getAge();

        // then
        assertEquals(thisYear - birthYear, age);
    }
}