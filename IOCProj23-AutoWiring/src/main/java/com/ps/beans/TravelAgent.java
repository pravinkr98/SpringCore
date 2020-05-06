package com.ps.beans;

public class TravelAgent {
	private TourPlan tp;
	
	public TravelAgent() {
		System.out.println("TravelAgent.TravelAgent()");
	}
		
	public TravelAgent(TourPlan tp) {
		System.out.println("TravelAgent.TravelAgent()");
		this.tp = tp;
	}

	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent.setTp()");
		this.tp = tp;
	}

	public String touring() {
		int count=tp.getPlaces().length;
		return tp.toString()+" place visited spending "+(count*5000);
	}	

}
