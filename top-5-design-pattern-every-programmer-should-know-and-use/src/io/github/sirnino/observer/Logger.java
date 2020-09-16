package io.github.sirnino.observer;

public class Logger implements Observer {

	@Override
	public void react() {
		System.out.println("Log event on central log server");
	}

}
