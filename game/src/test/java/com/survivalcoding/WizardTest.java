package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WizardTest {

    @Test
    @DisplayName("if hp is negative, set hp as 0")
    void setHP_Negative() {
        // given
        Wizard wizard = new Wizard();

        // when
        wizard.setHp(-10);

        // then
        assertEquals(0, wizard.getHp());
    }

    @Test
    @DisplayName("if mp is negative, exception happens")
    void setMP_negative() {
        // given
        Wizard wizard = new Wizard();

        // when, then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-5);
        });
    }

    @Test
    @DisplayName("if mp is positive, run")
    void setMP_positive() {
        // given
        Wizard wizard = new Wizard();

        // when
        wizard.setMp(0);

        // then
        assertEquals(0, wizard.getMp());
    }

    @Test
    @DisplayName("if wizard name is under 3 characters, exception happens")
    void setName_under3() {
        // given
        Wizard wizard = new Wizard();

        // when, then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("AB");
        });
    }

    @Test
    @DisplayName("if wand is NULL, exception happens")
    void setWand_null() {
        // given
        Wizard wizard = new Wizard();

        // when, then
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
    }

    @Test
    @DisplayName("if wand is successfully set, getWand must be run")
    void setWand_normal() {
        // given
        Wizard wizard = new Wizard();
        Wand wand = new Wand();
        wand.setName("Fire wand");
        wand.setPower(10.0);

        // when
        wizard.setWand(wand);

        // then
        assertEquals(wand, wizard.getWand());
    }
}