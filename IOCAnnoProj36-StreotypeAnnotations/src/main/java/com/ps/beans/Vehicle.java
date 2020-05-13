package com.ps.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

//@Component("vehicle1")
@Component
/*@PropertySources(value= {@PropertySource(value="com/ps/commons/info.properties"),
														@PropertySource(value="com/ps/commons/info1.properties")
														}
										) up to spring 3.x */
//from spring 4.x
//@PropertySource(value="com/ps/commons/info.properties")
//@PropertySource(value="com/ps/commons/info1.properties")
@PropertySource(value= {"com/ps/commons/info.properties","com/ps/commons/info1.properties"})
public class Vehicle {
	
	@Value("${vehicle.type}")
	private String type;
	
	@Autowired
	//@Qualifier("pEngine")
	private Engine engg;
	
	public void journey(String startPlace,String endPlace) {
		System.out.println("Vehicle.journey():: journey started from "+startPlace);
		engg.start();
		System.out.println("journey is going on.....");
		engg.stop();
		System.out.println("Vehicle.journey():: journey ended at "+endPlace);
	}

}
