package com.survivalcoding;

import java.util.Random;


public class Cleric {
    String name;
    int hp = 50;
    final int MAX_HP = 50;
    int mp = 10;
    final int MAX_MP = 10;

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

