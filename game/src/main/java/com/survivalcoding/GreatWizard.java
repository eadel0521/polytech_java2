package com.survivalcoding;

public class GreatWizard extends Wizard {

    public GreatWizard() {
        setMp(150);
    }

    @Override
    void heal(Hero hero) {
        if (getMp() < 5) {
            System.out.println("Not enough MP");
            return;
        }
        hero.setHp(hero.getHp() + 25);
        setMp(getMp() - 5);
        System.out.println("Cast heal. Character HP: " + hero.getHp());
    }

    void superHeal(Hero hero) {
        if (getMp() < 50) {
            System.out.println("Not enough MP");
            return;
        }
        hero.setHp(hero.getMaxHp());  // hp를 최대로
        setMp(getMp() - 50);
        System.out.println("Cast super heal. Character HP: " + hero.getHp());
    }
}