package com.survivalcoding;

public class PoisonSlime extends Slime {
    private int poisonCount = 5;

    public PoisonSlime(String suffix) {
        super(suffix);
        this.suffix = suffix;
    }

    @Override
    void attack(Hero hero) {
        super.attack(hero);

        if (poisonCount != 0) {
            System.out.println("Poison attack!");

            int poisonDamage = hero.getHp() / 5;
            hero.setHp(hero.getHp() - poisonDamage);
            System.out.println(poisonDamage + "point damage");

            poisonCount--;
        }
    }
}
