package com.ps.beans;

import java.util.Properties;

public class FruitsStore {
	private Properties fruitsInfo;
	
	public FruitsStore() {
		System.out.println("FruitsStore::0-param constructor<Properties>");
	}

	public void setFruitsInfo(Properties fruitsInfo) {
		this.fruitsInfo = fruitsInfo;
	}

	@Override
	public String toString() {
		return "FruitsStore [fruitsInfo=" + fruitsInfo + "]";
	}
	
	
}
