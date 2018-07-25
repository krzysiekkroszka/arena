package com.krzysiek.arena;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Creature implements Fightable{

    private Integer strength;
    private Integer dexterity;
    private Integer initiative;
    private Integer velocity;
    private Integer endurance;
    private Integer numberOfAttacks;
    private Integer numberOfDodges;
    private Integer lifePoints;
    private CreatureType type;

    public Creature(Integer strength, Integer dexterity, Integer initiative, Integer velocity, Integer endurance, Integer numberOfAttacks, Integer numberOfDodges, Integer lifePoints, CreatureType type) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.initiative = initiative;
        this.velocity = velocity;
        this.endurance = endurance;
        this.numberOfAttacks = numberOfAttacks;
        this.numberOfDodges = numberOfDodges;
        this.lifePoints = lifePoints;
        this.type = type;
    }

    static HashMap hitProbability = new HashMap<BodyPart, Float>();
    static HashMap hitBonus = new HashMap<BodyPart, Integer>();


    public Integer getStrength() {
        return strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public Integer getEndurance() {
        return endurance;
    }

    public Integer getNumberOfAttacks() {
        return numberOfAttacks;
    }

    public Integer getNumberOfDodges() {
        return numberOfDodges;
    }

    public Integer getLifePoints() {
        return lifePoints;
//  komentarz
    }

    public CreatureType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "strength=" + strength +
                ", dexterity=" + dexterity +
                ", initiative=" + initiative +
                ", velocity=" + velocity +
                ", endurance=" + endurance +
                ", numberOfAttacks=" + numberOfAttacks +
                ", numberOfDodges=" + numberOfDodges +
                ", lifePoints=" + lifePoints +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int attack(Creature target) {
        Random rand = new Random();
        int potentialDamage;
        if (this.getDexterity() > 1 + rand.nextInt(10)) {
            potentialDamage = target.getStrength() + rand.nextInt(4);
            System.out.println(type + ": attack succeeded, potential damage: " + potentialDamage);
            return potentialDamage;
        }
        else {
            System.out.println(type + ": attack failed.");
            return 0;
        }
    }

    @Override
    public void dodge(int potentialDamage, Creature attacker) {
        int actualDamage;
        Random rand = new Random();
        if (this.getInitiative() > 1 + rand.nextInt(10)) {
            System.out.println(type + ": dodge succeeded.");
        }
         else{
            actualDamage = potentialDamage - this.getEndurance();
            if (actualDamage> 0 ) {
                lifePoints = lifePoints - actualDamage;
                System.out.println(type + ": dodge failed, lifePoints: " + lifePoints);
                if (lifePoints > 0)
                    System.out.println(type +": I am alive.");
                else
                    System.out.println(type + ": I am dead.");
            }
        }
    }
}
