package io.github.sirnino.facade;

public class Restaurant {
	
	private Chef cook1 = new DessertChef();
	private Chef cook2 = new PizzaChef();
	private Chef cook3 = new HamburgerChef();
	
	public Meal breakfast() {
		return cook1.cook();
	}
	
	public Meal lunch() {
		return cook3.cook();
	}
	
	public Meal dinner() {
		return cook2.cook();
	}

}
