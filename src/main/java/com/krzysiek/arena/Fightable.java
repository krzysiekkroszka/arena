package com.krzysiek.arena;

public interface Fightable {
    int attack(Creature target);
    void dodge(int potentialDamage, Creature attacker);
    }
