package com.ps.test;

import com.ps.singleton.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		//get object
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		
		System.out.println("p1==p2?"+(p1==p2));
		System.out.println(".................");
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		
		//use object
		p1.printMessage("hello");
		p2.printMessage("Praveen");
	}

}
