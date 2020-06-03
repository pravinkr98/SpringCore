package com.ps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ps.external.ExternalIccScoreComp;
@Service("cbService")
public class CrickBuzzServiceImpl implements CrickBuzzService {
	
	@Autowired
	private ExternalIccScoreComp extComp;
	
	@Override
	public String fetchMatchScore(int mid)  {
		//return score by using external comp
		
		return  extComp.getScore(mid);
	}

}
