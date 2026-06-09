package com.survivalcoding;

import java.util.Random;


public class Cleric {
    String name;
    int hp = 50;
    static final int MAX_HP = 50;
    int mp = 10;
    static final int MAX_MP = 10;

    // A) 이름, HP, MP 모두 지정
    Cleric(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    // B) 이름, HP만 지정 → MP는 MAX_MP로
    Cleric(String name, int hp) {
        this(name, hp, MAX_MP);  // A) 생성자 호출
    }

    // C) 이름만 지정 → HP는 MAX_HP, MP는 MAX_MP로
    Cleric(String name) {
        this(name, MAX_HP);  // B) 생성자 호출
    }

    void selfAid() {
        mp -= 5;
        hp = MAX_HP;
    }

    int pray(int time) {
        Random rand = new Random();
        int rec_mp = time + rand.nextInt(3);

        if (mp + rec_mp > MAX_MP) {
            rec_mp = MAX_MP - mp;
        }

        mp += rec_mp;
        return rec_mp;
    }

}

