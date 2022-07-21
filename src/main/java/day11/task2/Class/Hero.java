package day11.task2;

import day11.task2.Interface.PhysAttack;

public abstract class Hero implements PhysAttack {
     protected int health;
     protected static final int MAX_HEALTH = 100;
     protected static final int MIN_HEALTH = 0;
     protected double physDef ;
     protected double magicDef;
     protected int physAtt ;
     private String type;

    public Hero() {
        this.health = 100;
        this.type = getType();
    }
    public void physicalAttack(Hero hero) {
        double attack = physAtt *  (1 - hero.physDef);
        if(hero.health - attack < MIN_HEALTH) {
            hero.health = MIN_HEALTH;
        }else{
            hero.health -= attack;
        }
    }
    public String getType() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getType() + " health: " + health;
    }
}
