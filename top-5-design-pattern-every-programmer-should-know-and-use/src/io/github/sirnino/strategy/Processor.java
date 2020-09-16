package io.github.sirnino.strategy;

public class Processor {
	
	private MyProcess proc;
	
	public Processor(MyProcess processToExecute) {
		this.proc = processToExecute;
	}
		
	public void run() {
		proc.extract();
		proc.transform();
		proc.load();
	}

}
