package com.epam.knight;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.epam.armor.Armor;

public class Runner {

	private static Logger log = Logger.getLogger(Runner.class.getName());

	public static void main(String[] args) {
		Knight knight = new Knight();
		knight.setName("Glorible");

		List<Armor> ammunitions = new ArrayList<Armor>();
		ArmorFactory armorFactory = new ArmorFactory();
		for (ArmorType type : ArmorType.values()) {
			Armor armor = armorFactory.createArmor(type);
			ammunitions.add(armor);
		}

		knight.setKnightAmmunation(ammunitions);

		log.info("Winner knight");
		log.info("calculating the total weight of knight ammunation");

	}

	public static void cloneAndSerialazeKnight(Knight givenKnight) {

		Knight cloneOfKnight;

		try {
			cloneOfKnight = givenKnight.clone();
			cloneOfKnight.setName("Archibald");
			log.info("setting the name of new knight - "
					+ cloneOfKnight.getName());
		} catch (CloneNotSupportedException e) {
			log.warning("the object cannot be cloned");
		}

		// исключения

		// log.info("serializing Knight");
		// FileOutputStream outputFile = new FileOutputStream("temp.out");
		// ObjectOutputStream outputObject = new ObjectOutputStream(outputFile);
		// Knight outts = new Knight();
		// outputObject.writeObject(outts);
		// outputObject.flush();
		// outputObject.close();
		//
		// log.info("deserializing Knight");
		// FileInputStream inputFile = new FileInputStream("temp.out");
		// ObjectInputStream inputObject = new ObjectInputStream(inputFile);
		// Knight ints = (Knight) inputObject.readObject();

	}
}
