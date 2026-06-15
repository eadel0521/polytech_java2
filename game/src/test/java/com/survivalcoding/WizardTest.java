package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {

    @Test
    @DisplayName("if hp is negative, set hp as 0")
    void setHP_Negative() {

        Wizard wizard = new Wizard();

        wizard.setHp(-10);

        assertEquals(0, wizard.getHp());
    }

    @Test
    @DisplayName("if mp is negative, exception happens")
    void setMP_negative() {

        Wizard wizard = new Wizard();

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-5);
        });
    }

    @Test
    @DisplayName("if mp is positive, run")
    void setMP_positive() {

        Wizard wizard = new Wizard();

        wizard.setMp(0);

        assertEquals(0, wizard.getMp());
    }

    @Test
    @DisplayName("if wizard name is under 3 characters, exception happens")
    void setName_under3() {

        Wizard wizard = new Wizard();

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("AB");
        });
    }

    @Test
    @DisplayName("if wand is NULL, exception happens")
    void setWand_null() {

        Wizard wizard = new Wizard();

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
    }

    @Test
    @DisplayName("if wand is successfully set, getWand must be run")
    void setWand_normal() {

        Wizard wizard = new Wizard();
        Wand wand = new Wand();
        wand.setName("Fire wand");
        wand.setPower(10.0);

        wizard.setWand(wand);

        assertEquals(wand, wizard.getWand());
    }
}