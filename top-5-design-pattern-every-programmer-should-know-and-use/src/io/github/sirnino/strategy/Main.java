package io.github.sirnino.strategy;

public class Main {

	public static void main(String[] args) {
		
		Processor processor1 = new Processor(new ProcessOne());
		processor1.run();
		
		Processor processor2 = new Processor(new ProcessTwo());
		processor2.run();
		
		Processor processor3 = new Processor(new ProcessThree());
		processor3.run();
		
	}

}
