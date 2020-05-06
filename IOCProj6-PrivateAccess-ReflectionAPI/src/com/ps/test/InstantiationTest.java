package com.ps.test;

import java.lang.reflect.Constructor;

import com.ps.beans.Test;

public class InstantiationTest {

	public static void main(String[] args) {
		Class c=null;
		Constructor cons[]=null;
		Test t1=null,t2=null;
		try {
			//Load class
			c=Class.forName("com.ps.beans.Test");
			//get Access to constructors
			cons=c.getDeclaredConstructors();
			//set Access to private constructors
			cons[0].setAccessible(true);
			cons[1].setAccessible(true);
			//instantiate the classes
			t1=(Test)cons[0].newInstance();
			System.out.println(t1);
			System.out.println("................");
			t2=(Test)cons[1].newInstance(10,20);
			System.out.println(t2);
		}
		catch(InstantiationException iae) {
			iae.printStackTrace();
		}
		catch(IllegalAccessException ile) {
			ile.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
