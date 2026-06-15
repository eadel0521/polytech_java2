package com.survivalcoding;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Person02, Integer> people = new HashMap<>();
        people.put(new Person02("Hong"), 20);
        people.put(new Person02("Han"), 25);

        for (Map.Entry<Person02, Integer> entry : people.entrySet()) {
            System.out.println(entry.getKey().name + " is " + entry.getValue() + " years old.");
        }
    }
}