package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    @Test
    @DisplayName("SelfAid should restore hp to MAX_HP")
    void selfAid_hp() {
        // given (준비)
        final Cleric cleric = new Cleric("Anduin");
        cleric.hp = 20;

        // when (실행)
        cleric.selfAid();

        // then (검증)
        assertEquals(50, cleric.hp);
    }

    @Test
    @DisplayName("mp reduce 5 after SelfAid")
    void selfAid_mp() {
        // given
        final Cleric cleric = new Cleric("Anduin");

        // when
        cleric.selfAid();

        // then
        assertEquals(5, cleric.mp);
    }

    @Test
    @DisplayName("Pray should restore mp")
    void pray_mp() {
        // given
        final Cleric cleric = new Cleric("Anduin");
        cleric.mp = 0;

        // when
        int rec_mp = cleric.pray(3);

        // then (3초 기도 → 회복량은 3~5)
        assertTrue(rec_mp >= 3 && rec_mp <= 5);
    }

    @Test
    @DisplayName("mp cannot overflow MAX_MP after Pray")
    void pray_max_mp() {
        // given
        final Cleric cleric = new Cleric("Anduin"); // mp = 10 (이미 최대)

        // when
        int recovered = cleric.pray(3);

        // then
        assertEquals(0, recovered);
        assertEquals(10, cleric.mp);
    }

    @Test
    @DisplayName("Cleric can be instantiated with name, hp, and mp")
    void constructor_all() {

        final Cleric cleric = new Cleric("Anduin", 40, 5);

        assertEquals("Anduin", cleric.name);
        assertEquals(40, cleric.hp);
        assertEquals(5, cleric.mp);
    }

    @Test
    @DisplayName("Cleric can be instantiated with name and hp, mp defaults to MAX_MP")
    void constructor_name_hp() {

        final Cleric cleric = new Cleric("Anduin", 35);

        assertEquals("Anduin", cleric.name);
        assertEquals(35, cleric.hp);
        assertEquals(Cleric.MAX_MP, cleric.mp);
    }

    @Test
    @DisplayName("Cleric can be instantiated with name only, hp and mp default to max values")
    void constructor_name_only() {

        final Cleric cleric = new Cleric("Anduin");

        assertEquals("Anduin", cleric.name);
        assertEquals(Cleric.MAX_HP, cleric.hp);
        assertEquals(Cleric.MAX_MP, cleric.mp);
    }

}