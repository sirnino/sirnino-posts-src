package io.github.sirnino.singleton;

public class MySingleton {
	
	private static MySingleton instance;
	
	private MySingleton() {
		//Do your construction stuff
	}
	
	public static MySingleton getInstance() {
		MySingleton localRef = instance;
        if (localRef == null) {
            synchronized (MySingleton.class) {
                localRef = instance;
                if (localRef == null) {
                	instance = localRef = new MySingleton();
                }
            }
        }
        return localRef;
	}
	
	public void dump() {
		System.out.println(this);
	}

}
