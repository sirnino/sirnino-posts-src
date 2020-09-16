package io.github.sirnino.strategy;

public class ProcessThree implements MyProcess {

	@Override
	public void extract() {
		System.out.println("Get data from MySQL");
	}

	@Override
	public void transform() {
		System.out.println("Do Nothing");
	}

	@Override
	public void load() {
		System.out.println("Send them via HTTP");
	}

}
