package com.krzysiek.arena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

public class ArenaApplication {

	public static void main(String[] args) {

		CreaturesFactory factory = new CreaturesFactory();
		BodyPart bodyPart;
		List<Creature> creatureList = factory.randomCreatureList(2);

		//for(int i=0;i<creatureList.size();i++)
		//	System.out.println("CREATURE " + i + ": " +creatureList.get(i));


		ArrayList<Double> frequencies = new ArrayList<>();
		Integer key;
		for (int i=0; i<=BodyPart.values().length;i++) {
			frequencies.add(i,0.0);
		}
		for (int j = 0; j < 100000; j++) {
			try {
				bodyPart = creatureList.get(0).randomBodyPart();
				key = bodyPart.ordinal();
				frequencies.set(key, frequencies.get(key) + 1);
			} catch (NoBodyPartException ex) {
				key = BodyPart.values().length;
				frequencies.set(key, frequencies.get(key) + 1);
			}
		}

		for (int i=0; i<=BodyPart.values().length;i++)
			frequencies.set(i, frequencies.get(i)/100000);

		System.out.println (frequencies);
		//	new FightService().fight(creatureList.get(0),creatureList.get(1));
	}
}
