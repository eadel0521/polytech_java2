package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    @DisplayName("Map stores name-age pairs and retrieves age by name")
    void storingNameAndAgeInMap_allowsRetrievingAgeByName() {

        Person02 hong = new Person02("Hong");
        Person02 han = new Person02("Han");

        Map<String, Integer> ages = new HashMap<>();
        ages.put(hong.name, 20);
        ages.put(han.name, 25);

        assertEquals(20, ages.get("Hong"));
        assertEquals(25, ages.get("Han"));
        assertEquals(2, ages.size());
    }
}
