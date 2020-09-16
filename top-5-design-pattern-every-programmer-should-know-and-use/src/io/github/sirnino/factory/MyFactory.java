package io.github.sirnino.factory;

public class MyFactory {

	public static Person getPerson(PersonType type) {
		Person ret;
		switch(type) {
			case STUDENT:
				ret = new Student();
				break;
			case EMPLOYEE:
				ret = new Employee();
				break;
			default:
				throw new RuntimeException("Unknown type "+type);
		}
		
		return ret;
	}

}
