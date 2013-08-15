package com.epam.knight;

import java.io.IOException;
import java.util.Properties;

import com.epam.armor.Armor;
import com.epam.armor.Hemlet;

public class ArmorFactory {

	public Armor createArmor(ArmorType armorType) {
		Armor result = null;
		switch (armorType) {
		case HEMLET:
			result = createHamlet(armorType.getSourceProperty());
			break;

		default:
			break;
		}
		return result;
	}

	private Hemlet createHamlet(String configPath) {
		Properties properties = loadProperty(configPath);
		String name = properties.getProperty("name");
		int price = Integer.valueOf(properties.getProperty("price"));
		int thickness = Integer.valueOf(properties.getProperty("thickness"));
		int weight = Integer.valueOf(properties.getProperty("weight"));
		return new Hemlet(name, price, thickness, weight);
	}

	public Properties loadProperty(String path) {
		Properties properties = new Properties();
		try {
			properties.load(getClass()
					.getResourceAsStream(path + ".properties"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return properties;

	}
}
