package com.ps.test;

import java.lang.reflect.Constructor;

public class NewInstanceTest2 {

	public static void main(String[] args)throws Exception {
		Class c1=null,c2=null;
		Constructor cons1[]=null,cons2[]=null;
		Object obj1=null,obj2=null,obj3=null,obj4=null;
		//Load Test class (Test)
		c1=Class.forName(args[0]);
		//get All constructors
		cons1=c1.getDeclaredConstructors();
		//create object loaded class
		 obj1=cons1[1].newInstance(10,20);
		 System.out.println(obj1.toString());
		 
		 System.out.println(".......................");
			//Load Test class (java.util.Date)
			c2=Class.forName(args[1]);
			//get All constructors
			cons2=c2.getDeclaredConstructors();
			//create object loaded class
			 obj2=cons2[5].newInstance(110,10,23);
			 obj3=cons2[3].newInstance();
			 obj4=cons2[4].newInstance(15);
			 System.out.println(obj2.toString());
			 System.out.println(obj3.toString());
			 System.out.println(obj4.toString());

	}

}
