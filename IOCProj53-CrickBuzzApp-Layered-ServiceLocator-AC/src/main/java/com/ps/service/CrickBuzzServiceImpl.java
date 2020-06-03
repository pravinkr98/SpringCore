package com.ps.service;

import com.ps.external.ExternalIccScoreComp;
import com.ps.locator.IccScoreCompServiceLocator;

public class CrickBuzzServiceImpl implements CrickBuzzService {
	private ExternalIccScoreComp extComp;
	
	public CrickBuzzServiceImpl(ExternalIccScoreComp extComp) {
		this.extComp = extComp;
	}

	@Override
	public String fetchMatchScore(int mid)  {
		//return score by using external comp
		return  extComp.getScore(mid);
	}

}
