package io.github.sirnino.facade;

public class Meal {
	
	private String description;
	
	public Meal (String mealtype) {
		this.description = mealtype;
	}
	
	public String getDescription() {
		return this.description;
	}

}
