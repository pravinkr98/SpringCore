package com.ps.beans;

import org.springframework.stereotype.Component;

@Component("charger")
public class MobilePhoneBatteryCharger {
	
	public MobilePhoneBatteryCharger() {
		System.out.println("MobilePhoneBatteryCharger.:; 0-param constructor");
	}
	
	public void charging() {
		System.out.println("MobilePhoneBatteryCharger...check for 100% charging");
	}
}
