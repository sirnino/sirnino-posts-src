package io.github.sirnino.facade;

public class PizzaChef implements Chef {

	//A chef able to cook only Pizza
	
	public Meal cook() {
		return new Meal("Pizza");
	}

}
