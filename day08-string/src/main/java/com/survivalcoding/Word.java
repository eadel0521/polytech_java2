package com.survivalcoding;

public class Word {
    private String letters;

    public Word(String letters) {
        this.letters = letters;
    }

    public boolean isVowel(int i) {
        String c = letters.substring(i, i + 1);
        return c.matches("[aeiouAEIOU]");
    }

    public boolean isConsonant(int i) {
        String c = letters.substring(i, i + 1);
        return c.matches("[a-zA-Z]") && !isVowel(i);
    }
}