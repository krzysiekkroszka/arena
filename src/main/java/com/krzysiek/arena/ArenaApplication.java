package com.krzysiek.arena;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;
import java.util.List;

public class ArenaApplication {

	public static void main(String[] args) {

		CreaturesFactory factory = new CreaturesFactory();

		List<Creature> creatureList = factory.randomCreatureList(2);

		for(int i=0;i<creatureList.size();i++)
			System.out.println("CREATURE " + i + ": " +creatureList.get(i));

		new FightService().fight(creatureList.get(0),creatureList.get(1));

	}
}
