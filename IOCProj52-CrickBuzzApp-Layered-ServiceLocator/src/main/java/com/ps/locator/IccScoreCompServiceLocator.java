package com.ps.locator;

import org.springframework.beans.factory.FactoryBean;

import com.ps.external.ExternalIccScoreComp;
import com.ps.external.ExternalIccScoreCompImpl;

public class IccScoreCompServiceLocator implements FactoryBean<ExternalIccScoreComp> {

	@Override
	public ExternalIccScoreComp getObject() throws Exception {
		ExternalIccScoreComp extComp=null;
		//Actually here we should written jndi lookup code.. Since we have External comp as
		// ordinary java class.. we are going to create and return object mannually
		extComp=new ExternalIccScoreCompImpl();
		return extComp;
	}

	@Override
	public Class<?> getObjectType() {
		
		return ExternalIccScoreCompImpl.class;
	}
	
	@Override
	public boolean isSingleton() {
		
		return true;
	}

}
