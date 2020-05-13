package com.ps.beans;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;

@Named("dEngine")
//@Primary
public class DeiselEngine implements Engine {
	
	@Value("${dEngineId}")
	private String engineId;

	@Override
	public void start() {
		System.out.println("DeiselEngine.start():: Deisel engine started with engine id \""+engineId+"\"");

	}

	@Override
	public void stop() {
		System.out.println("DeiselEngine.stop():: Deisel engine stopped.");

	}

}
