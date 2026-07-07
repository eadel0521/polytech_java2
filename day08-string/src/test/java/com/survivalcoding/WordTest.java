package com.survivalcoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WordTest {
    @Test
    void vowelTest() {
        Word word = new Word("hello");
        Word wordUpper = new Word("HELLO");

        assertTrue(word.isVowel(1));   // e는 모음
        assertFalse(word.isVowel(0));  // h는 모음 아님

        assertTrue(word.isConsonant(0));   // h는 자음
        assertFalse(word.isConsonant(1));  // e는 자음 아님

        assertTrue(wordUpper.isVowel(1));   // E는 모음
        assertFalse(wordUpper.isVowel(0));  // H는 모음 아님

        assertTrue(wordUpper.isConsonant(0));   // H는 자음
        assertFalse(wordUpper.isConsonant(1));  // E는 자음 아님
    }
}