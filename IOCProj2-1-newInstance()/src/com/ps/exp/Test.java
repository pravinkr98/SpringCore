package com.ps.exp;

public class Test {
	int a,b;
	
	public  Test() {
		System.out.println("Test:: 0-param constructor");
	}
	
	public Test(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Test:: 2-param constructor");
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + "]";
	}
	
}
