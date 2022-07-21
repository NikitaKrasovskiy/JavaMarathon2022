package day11.task2;

import day11.task2.Interface.Healer;
import day11.task2.Interface.MagicAttack;

public class Shaman extends Hero implements Healer, MagicAttack {
    private static final int HEAL_FOR_YOURSELF = 50;
    private static final int HEAL_FOR_PARTNER = 30;
    private static final int MAGIC_ATT = 15;

    public Shaman() {
        physAtt = 10;
        physDef = 0.2;
        magicDef = 0.2;
    }

    @Override
    public void healHimself() {
        if (health + HEAL_FOR_YOURSELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        } else {
            health += HEAL_FOR_YOURSELF;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if (hero.health + HEAL_FOR_PARTNER > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        } else {
            hero.health += HEAL_FOR_PARTNER;
        }
    }
    @Override
    public void magicalAttack(Hero hero) {
        double attack = MAGIC_ATT * (1 - hero.magicDef);
        if (hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        } else {
            hero.health -= attack;
        }
    }
}
