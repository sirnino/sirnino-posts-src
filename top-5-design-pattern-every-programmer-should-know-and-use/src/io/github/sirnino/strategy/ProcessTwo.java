package io.github.sirnino.strategy;

public class ProcessTwo implements MyProcess {

	@Override
	public void extract() {
		System.out.println("Get data via FTP");
	}

	@Override
	public void transform() {
		System.out.println("Convert them in CSV");
	}

	@Override
	public void load() {
		System.out.println("Save them into MongoDB Database");
	}

}
