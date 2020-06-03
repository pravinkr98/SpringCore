package com.ps.external;


public class ExternalIccScoreCompImpl implements ExternalIccScoreComp {

	@Override
	public String getScore(int mid) {
		if(mid==1234)
			return "IND :: 345/6 --->IND Vs PAK";
		else if(mid==2345)
			return "ENG ::244/4 --->ENG Vs SA";
		else if(mid==3456)
			return "BAN ::203/3 --->BAN Vs SL";
		throw new IllegalArgumentException("Invalid match id");		
		
	}

}
