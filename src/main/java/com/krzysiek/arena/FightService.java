package com.krzysiek.arena;

public class FightService {
    public void fight (Creature creatureOne, Creature creatureTwo){
        System.out.println("Fight between:\n" + creatureOne + "\n" + creatureTwo);
        while (creatureOne.getLifePoints() > 0 && creatureTwo.getLifePoints() > 0) {
            int potentialDamage = creatureOne.attack(creatureTwo);
            if (potentialDamage > 0)
                creatureTwo.dodge(potentialDamage, creatureOne);
            potentialDamage = creatureTwo.attack(creatureOne);
            if (potentialDamage > 0)
            creatureOne.dodge(potentialDamage, creatureTwo);
        }
    };
};

