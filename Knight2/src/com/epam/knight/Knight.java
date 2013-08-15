package com.epam.knight;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.epam.armor.Armor;

public class Knight implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private List<Armor> knightAmmunations;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Armor> getKnightAmmunation() {
		return knightAmmunations;
	}

	public void setKnightAmmunation(List<Armor> knightAmmunation) {
		this.knightAmmunations = knightAmmunation;
	}

	public int getWeight(List<Armor> listOfArmor) {
		int weight = 0;
		for (Armor armor : listOfArmor) {
			weight += armor.getWeight();
		}
		return weight;
	}

	// ..Перенести в другое место
	// public static void showArmor(List<Armor> listOfArmor) {
	// System.out.printf("%10s %10s %10s %10s %n", "Name", "Price",
	// "Thickness", "Weight");
	// for (Armor armor : listOfArmor) {
	// System.out.printf("%10s %10d %10d %10d %n", armor.getName(),
	// armor.getPrice(), armor.getThickness(), armor.getWeight());
	// }
	// }

	
	public List<Armor> sortArmorByWeight() {
		List<Armor> sortedAmmunations = new ArrayList<Armor>(knightAmmunations);
		Collections.sort(sortedAmmunations, new Comparator<Armor>() {
			@Override
			public int compare(Armor c1, Armor c2) {
				return c1.getWeight() - c2.getWeight();
			}
		});
		return sortedAmmunations;
	}

	public Knight clone() throws CloneNotSupportedException {
		Knight cloneOfKnight = (Knight) super.clone();

		return cloneOfKnight;
	}

}
