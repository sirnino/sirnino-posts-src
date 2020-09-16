package io.github.sirnino.facade;

public class DessertChef implements Chef {

	//A chef able to cook only Dessert
	
	public Meal cook() {
		return new Meal("Dessert");
	}

}
