package day11.task2;

import day11.task2.Interface.MagicAttack;

public class Magician extends Hero implements MagicAttack {
    private static final int MAGIC_ATT = 20;
    public Magician() {
        physDef = 0;
        magicDef = 0.8;
        physAtt = 5;
    }
    @Override
    public void magicalAttack(Hero hero) {
        double attack = MAGIC_ATT * (1 - hero.magicDef);
        if(hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }else{
            hero.health -= attack;
        }
    }
}