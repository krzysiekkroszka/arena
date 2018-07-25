package com.krzysiek.arena;

public class Elf extends Creature {

    public Elf(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance, Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints) {
        super(strength, dexterity, initiative, velocity, endurance, numberOfAttacks, numberOfDodges, lifePoints, CreatureType.ELF);
    }

    @Override
    public int attack(Creature target) {
        return 0;
    }

    @Override
    public void dodge(int potentialDamage, Creature attacker) {

    }
}
