package io.github.sirnino.factory;

public class Employee implements Person{

	private static final String DESCRIPTION = "Engineer";
	
	@Override
	public String getWork() {
		return DESCRIPTION;
	}

}
