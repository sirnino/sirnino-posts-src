package io.github.sirnino.factory;

public class Student implements Person{

	private static final String DESCRIPTION = "Student";
	
	@Override
	public String getWork() {
		return DESCRIPTION;
	}

}
