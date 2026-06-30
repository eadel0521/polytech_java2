package com.survivalcoding;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StrongBoxTest {

    @Test
    @DisplayName("Before limit: get() returns null")
    void returnsNullBeforeLimit() {

        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        box.put("gold");

        assertNull(box.get()); // 1번째 호출, 아직 1024회 미달
    }

    @Test
    @DisplayName("On limit: get() returns item")
    void returnsItemOnLimit() {

        StrongBox<String> box = new StrongBox<>(KeyType.PADLOCK);
        box.put("gold");

        for (int i = 1; i < 1_024; i++) box.get();

        assertEquals("gold", box.get()); // 1024번째
    }

}

