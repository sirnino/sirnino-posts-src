package io.github.sirnino.observer;

public class Main {

	public static void main(String[] args) {
		DataHandler dh = new DataHandler();
		
		dh.addObserver(new Validator());
		dh.addObserver(new Notifier());
		dh.addObserver(new Logger());
		
		dh.saveData(1);
		System.out.println("=====");
		
		dh.saveData(2);
		System.out.println("=====");
		
		dh.saveData(3);
		System.out.println("=====");

	}

}
