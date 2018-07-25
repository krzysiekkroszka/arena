package com.krzysiek.arena;

public enum BodyPart {
    HEAD(0.05, 3),
    LEFT_ARM(0.10, 1),
    RIGHT_ARM(0.10, 1),
    TRUNK(0.30, 0),
    LEFT_LEG(0.05, 2),
    RIGHT_LEG(0.05, 2);

    private double hitProbabilty;
    private int hitBonus;

    BodyPart (double hitProbabilty, int hitBonus){
        this.hitProbabilty = hitProbabilty;
        this.hitBonus = hitBonus;
    }

    public double getHitProbabilty() {
        return hitProbabilty;
    }

    public int getHitBonus() {
        return hitBonus;
    }
}
