package io.github.sirnino.observer;

public class Validator implements Observer {

	@Override
	public void react() {
		System.out.println("Validate the entered data");
	}

}
