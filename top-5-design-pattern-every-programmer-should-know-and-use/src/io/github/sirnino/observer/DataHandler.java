package io.github.sirnino.observer;

import java.util.ArrayList;
import java.util.List;

public class DataHandler {
	
	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer obs) {
	    observers.add(obs);
	}

	public void removeObserver(Observer obs) {
		observers.remove(obs);
	}
	
	public void saveData(int data) {
		
		System.out.println("Data "+data+" saved correctly");
		
		notifyObservers();
	}
	
	public void notifyObservers() {
		observers.forEach(Observer::react);
	}

}
