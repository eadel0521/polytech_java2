package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WandTest {

    @Test
    @DisplayName("if wand name is NULL, exception happens")
    void setName_null() {

        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName(null);
        });
    }

    @Test
    @DisplayName("if wand name is under 3 characters, exception happens")
    void setName_under3() {

        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setName("AB");
        });
    }

    @Test
    @DisplayName("if wand name is over 3 characters, run")
    void setName_over3() {

        Wand wand = new Wand();

        wand.setName("Fire wand");

        assertEquals("Fire wand", wand.getName());
    }

    @Test
    @DisplayName("if power is under 0.5, exception happens")
    void setPower_under05() {

        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(0.3);
        });
    }

    @Test
    @DisplayName("if power is over 100, exception happens")
    void setPower_over100() {

        Wand wand = new Wand();

        assertThrows(IllegalArgumentException.class, () -> {
            wand.setPower(101);
        });
    }

    @Test
    @DisplayName("if power is between 0.5 and 100, run")
    void setPower_between05_100() {

        Wand wand = new Wand();

        wand.setPower(50.0);

        assertEquals(50.0, wand.getPower());
    }
}