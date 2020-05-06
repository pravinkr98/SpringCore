package com.ps.beans;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}

	@Override
	public String deliver(int orderid) {
		return "BlueDart is ready to deliver products of "+orderid;
	}
}//class
