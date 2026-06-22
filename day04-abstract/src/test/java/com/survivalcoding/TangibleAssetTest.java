package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TangibleAssetTest {
    @Test
    void GetterSetterTest() {
        Computer com = new Computer("Gram", 20000, "white", 2.0, "LG");
        com.setWeight(2.5);
        assertEquals(2.5, com.getWeight());
    }
}