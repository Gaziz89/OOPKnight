package com.epam.armor;

public abstract class Armor {

	private String name;
	private int price;
	private int thickness;
	private int weight;


	public Armor(String name, int price, int thickness, int weight) {
		this.name = name;
		this.price = price;
		this.thickness = thickness;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
