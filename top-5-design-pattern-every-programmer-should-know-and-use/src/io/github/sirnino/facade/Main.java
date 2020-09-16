package io.github.sirnino.facade;

public class Main {

	public static void main(String[] args) {
		Restaurant sirninos = new Restaurant();
		
		Meal breakfast = sirninos.breakfast();
		System.out.println(breakfast.getDescription());
		
		Meal lunch = sirninos.lunch();
		System.out.println(lunch.getDescription());
		
		Meal dinner = sirninos.dinner();
		System.out.println(dinner.getDescription());
		
	}

}
