package com.ps.beans;

public class Test {
	int a;
	int b;
	
	private Test() {
		this.a=0;
		this.b=0;
		System.out.println("Test :: 0- param constructor()");
	}
	
	private Test(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Test.Test(");
	}
	
	
	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
	
	
	

}
