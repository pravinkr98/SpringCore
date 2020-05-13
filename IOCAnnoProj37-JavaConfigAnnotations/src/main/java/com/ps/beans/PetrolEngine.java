package com.ps.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

@Named("pEngine")
public class PetrolEngine implements Engine {
	
	@Value("${pEngineId}")
	private String engineId;

	@Override
	public void start() {
		System.out.println("PetrolEngine.start():: Petrol engine started with engine id \""+engineId+"\"");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine.stop():: Petrol engine stopped.");

	}

}
