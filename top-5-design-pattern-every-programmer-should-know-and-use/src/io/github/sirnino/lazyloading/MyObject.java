package io.github.sirnino.lazyloading;

import java.util.ArrayList;
import java.util.List;

public class MyObject {
	
	private List<String> names;
	
	public List<String> getNames(){
		if(names == null) {
			initNames();
		}
		
		return names;
	}

	private void initNames() {
		this.names = new ArrayList<>();
		names.add("Seth Gibbs");
		names.add("Adele Villegas");
		names.add("Meadow Cannon");
		names.add("Manav Redfern");
		names.add("Alba Spencer");
		names.add("Ishan Hays");
		names.add("Zachary Ireland");
		names.add("Asad Kavanagh");
		names.add("Laylah Spears");
		names.add("Yaqub Howells");
	}

}
