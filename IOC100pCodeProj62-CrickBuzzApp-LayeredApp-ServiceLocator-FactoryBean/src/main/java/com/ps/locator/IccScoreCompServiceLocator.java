package com.ps.locator;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import com.ps.external.ExternalIccScoreComp;
import com.ps.external.ExternalIccScoreCompImpl;

//@Component("locator")
public class IccScoreCompServiceLocator {
	
	public IccScoreCompServiceLocator() {
		System.out.println("IccScoreCompServiceLocator :: 0-param constructor");
	}

	public static ExternalIccScoreComp getInstance(){
		ExternalIccScoreComp extComp=null;
		//Actually here we should written jndi lookup code.. Since we have External comp as
		// ordinary java class.. we are going to create and return object mannually
		extComp=new ExternalIccScoreCompImpl();
		return extComp;
	}

}
