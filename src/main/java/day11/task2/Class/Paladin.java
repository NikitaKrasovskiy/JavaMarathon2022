package day11.task2;

import day11.task2.Interface.Healer;

public class Paladin extends Hero implements Healer {
    private static final int HEAL_FOR_YOURSELF = 25;
    private static final int HEAL_FOR_PARTNER = 10;

    public Paladin() {
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + HEAL_FOR_YOURSELF > MAX_HEALTH) {
            health = MAX_HEALTH;
        }else{
            health += HEAL_FOR_YOURSELF;
        }
    }
    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + HEAL_FOR_PARTNER > MAX_HEALTH) {
            hero.health = MAX_HEALTH;
        }else{
            hero.health += HEAL_FOR_PARTNER;
        }
    }
}
