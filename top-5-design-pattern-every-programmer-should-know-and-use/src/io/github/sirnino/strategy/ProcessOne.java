package io.github.sirnino.strategy;

public class ProcessOne implements MyProcess {

	@Override
	public void extract() {
		System.out.println("Get data via HTTP");
	}

	@Override
	public void transform() {
		System.out.println("Convert them in XML");
	}

	@Override
	public void load() {
		System.out.println("Save them into Postgres Database");
	}

}
