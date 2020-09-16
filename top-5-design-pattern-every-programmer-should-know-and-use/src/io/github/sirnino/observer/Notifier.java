package io.github.sirnino.observer;

public class Notifier implements Observer {

	@Override
	public void react() {
		System.out.println("Notify 3rd party application via HTTP");
	}

}
