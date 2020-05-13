package com.ps.beans;

import javax.annotation.Resource;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

//@Component("vehicle1")
@Named
//@PropertySource(value="com/ps/commons/info.properties")
//@PropertySource(value="com/ps/commons/info1.properties")
//@PropertySource(value= {"com/ps/commons/info.properties","com/ps/commons/info1.properties"})
@Scope("singleton")
public class Vehicle {
	
	@Value("${vehicle.type}")
	private String type;
	
	/*@Inject
	@Named("pEngine")
	//@Qualifier("pEngine")*/
	//@Resource(name="pEngine")
	private Engine engg;
	
	/*//@Inject
	//@Named("pEngine")
	public Vehicle(@Named("pEngine")Engine engg) {
		super();
		this.engg = engg;
	}*/

	/*//@Inject
	//@Named("pEngine")
	//@Resource(name="pEngine")
	public void setEngg(Engine engg) {
		this.engg = engg;
	}*/
	
	//@Inject
	//@Named("pEngine")
	@Resource(name="pEngine")
	public void asign(Engine engg) {
		this.engg = engg;
	}

	public void journey(String startPlace,String endPlace) {
		System.out.println("Vehicle.journey():: journey started from "+startPlace);
		engg.start();
		System.out.println("journey is going on.....through \""+type+"\"");
		engg.stop();
		System.out.println("Vehicle.journey():: journey ended at "+endPlace);
	}

}
