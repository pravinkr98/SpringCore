package com.ps.beans;

import org.springframework.stereotype.Component;

@Component("charger")
public class MobilePhoneBatteryCharger {
	
	public void charging() {
		System.out.println("MobilePhoneBatteryCharger...check for 100% charging");
	}
}
