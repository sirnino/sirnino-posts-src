package io.github.sirnino.lazyloading;

public class Main {

	public static void main(String[] args) {
		MyObject obj = new MyObject();
		obj.getNames().forEach(System.out::println);
	}

}
