package io.github.sirnino.singleton;

public class Main {
	
	public static void main(String[] args) {
		
		MySingleton inst1 = MySingleton.getInstance();
		inst1.dump();
		
		MySingleton inst2 = MySingleton.getInstance();
		inst2.dump();
		
		System.out.println(inst1.equals(inst2));
		
	}

}
