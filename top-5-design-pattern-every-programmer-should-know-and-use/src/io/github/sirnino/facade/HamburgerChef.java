package io.github.sirnino.facade;

public class HamburgerChef implements Chef {

	//A chef able to cook only Hamburger
	
	public Meal cook() {
		return new Meal("Hamburger");
	}

}
