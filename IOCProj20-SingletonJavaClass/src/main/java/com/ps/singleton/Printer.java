package com.ps.singleton;

public class Printer {
	private static Printer INSTANCE;
	
	public Printer() {
		// no ouptut
		System.out.println("Printer:: 0-param constructor");
	}
	
	//static factory method
	public static Printer getInstance() {
		if(INSTANCE==null)
			INSTANCE=new Printer();
		
		return INSTANCE;
	}
	
	//B.method
	public void printMessage(String msg) {
		System.out.println(msg+" printed on paper");
	}

}
