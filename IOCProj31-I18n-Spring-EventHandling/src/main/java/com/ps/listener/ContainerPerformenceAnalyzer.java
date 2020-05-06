package com.ps.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class ContainerPerformenceAnalyzer implements ApplicationListener {
	private long start,end;
	
	public ContainerPerformenceAnalyzer() {
		System.out.println("ContainerPerformenceAnalyzer2.ContainerPerformenceAnalyzer2()");
	}
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		start=0;end=0;
		if(event.toString().contains("Refreshed"))
			start=System.currentTimeMillis();
		else if(event.toString().contains("Closed"))
			end=System.currentTimeMillis();
		
		System.out.println("start:: "+start);
		System.out.println("end:: "+end);
		System.out.println("Container is in execution mode for :: "+(end-start)+" ms");
		
	}

}
