package com.survivalcoding;

public class Slime {
    String suffix;
    int hp;

    public Slime(String suffix) {
        this.suffix = suffix;
    }


    void attack(Hero hero) {
        System.out.println("Slime " + suffix + "attacked");
        System.out.println("10 point damage");

        hero.setHp(hero.getHp() - 10);
    }
}

