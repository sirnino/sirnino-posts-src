package io.github.sirnino.factory;

public class Main {
	
	public static void main(String[] args) {
		
		Person p1 = MyFactory.getPerson(PersonType.STUDENT);
		System.out.println(p1.getWork());
		
		Person p2 = MyFactory.getPerson(PersonType.EMPLOYEE);
		System.out.println(p2.getWork());
		
	}

}
