package com.epam.knight;

public enum ArmorType {
	
	HEMLET("hemlet"), 
	BACKPLATE("backPlate");
	
	private String sourceProperty;

	private ArmorType(String sourceProperty) {
		this.sourceProperty = sourceProperty;
	}


	public String getSourceProperty() {
		return sourceProperty;
	}

	
	

}
