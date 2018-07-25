package com.krzysiek.arena;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaturesFactory {
    public static Creature generate(CreatureType type, int value) {
        switch (type) {
            case ELF:
                return new Elf(value, value, value, value, value, value, value, value);
            case HUMAN:
                return new Human(value, value, value, value, value, value, value, value);
            case HALFING:
                return new Halfing(value, value, value, value, value, value, value, value);
            case TROLL:
                return new Troll(value, value, value, value, value, value, value, value);
            case ORC:
                return new Orc(value, value, value, value, value, value, value, value);
            case DWARF:
                return new Dwarf(value, value, value, value, value, value, value, value);
        }
        ;
        return null;
    }

    CreatureType randomCreatureType() {
      Random rand = new Random();
      Integer typeid = rand.nextInt(6);
      return CreatureType.values()[typeid];
    };

    int random(int min, int max){
        Random rand = new Random();
        return min + rand.nextInt(max - min + 1);
    };

    public Creature randomCreature (){
        CreatureType randomType = randomCreatureType();
        int randomValue = random (1,12);
        return generate(randomType, randomValue);
    }



    List<Creature> randomCreatureList(int listSize){
        List<Creature> creatureList = new ArrayList<Creature>(listSize);
        for (int i = 0; i< listSize; i++){
            creatureList.add(randomCreature());
        };
        return creatureList;
    }
}