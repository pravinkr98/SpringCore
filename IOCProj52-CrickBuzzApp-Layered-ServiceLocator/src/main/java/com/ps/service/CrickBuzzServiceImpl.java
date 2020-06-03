package com.ps.service;

import com.ps.external.ExternalIccScoreComp;
import com.ps.locator.IccScoreCompServiceLocator;

public class CrickBuzzServiceImpl implements CrickBuzzService {

	@Override
	public String fetchMatchScore(int mid) throws Exception {
		ExternalIccScoreComp extComp=null;
		IccScoreCompServiceLocator locator=null;
		locator=new IccScoreCompServiceLocator();
		extComp=locator.getObject();
		return  extComp.getScore(mid);
	}

}
