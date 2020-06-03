package com.ps.beans;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.beans.factory.support.MethodReplacer;

public class InterestRateReplacer implements MethodReplacer {
	private float rate;
		
	public InterestRateReplacer() {
		System.out.println("InterestRateReplacer:: 0-param constructor");
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		float pAmt=0.0f;
		float time=0.0f;
		
		System.out.println("InterestRateReplacer.reimplement(-,-,-)--> new logic");
		System.out.println(obj.getClass()+"   "+method.getName()+"    "+Arrays.deepToString(args));
		pAmt=(float)args[0];	//new logic
		time=(float)args[1];
		
		return (pAmt*time*rate)/100.0f;
	}

}
