package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ClericTest {

    @Test
    @DisplayName("selfAid를 하면 hp가 MAX_HP로 회복되어야 한다")
    void selfAid_hp() {
        // given (준비)
        final Cleric cleric = new Cleric();
        cleric.hp = 20;

        // when (실행)
        cleric.selfAid();

        // then (검증)
        assertEquals(50, cleric.hp);
    }

    @Test
    @DisplayName("selfAid를 하면 mp가 5 소비되어야 한다")
    void selfAid_mp() {
        // given
        final Cleric cleric = new Cleric();

        // when
        cleric.selfAid();

        // then
        assertEquals(5, cleric.mp);
    }

    @Test
    @DisplayName("pray를 하면 mp가 회복되어야 한다")
    void pray_mp() {
        // given
        final Cleric cleric = new Cleric();
        cleric.mp = 0;

        // when
        int rec_mp = cleric.pray(3);

        // then (3초 기도 → 회복량은 3~5)
        assertTrue(rec_mp >= 3 && rec_mp <= 5);
    }

    @Test
    @DisplayName("pray를 해도 mp가 MAX_MP를 초과할 수 없다")
    void pray_max_mp() {
        // given
        final Cleric cleric = new Cleric(); // mp = 10 (이미 최대)

        // when
        int recovered = cleric.pray(3);

        // then
        assertEquals(0, recovered);
        assertEquals(10, cleric.mp);
    }
}