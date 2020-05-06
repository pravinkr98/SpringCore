package com.ps.beans;

import java.util.Random;

public class Flipkart {
	private Courier courier;
	public Flipkart() {
		System.out.println("Flipkart:0-param constructor");
	}
	//setter method for setter injection
	public void setCourier(Courier courier) {
		System.out.println("Flipkart:setCourier(-)");
		this.courier=courier;
	}
	public String purchase(String items[]) {
		//generate order id
		Random rad=null;
		rad=new Random();
		int orderid=rad.nextInt(700000);
		//deliver order
		String status=courier.deliver(orderid);
		return status+" Bill amount for order id "+orderid+" is 7000";
	}//method
}//class
