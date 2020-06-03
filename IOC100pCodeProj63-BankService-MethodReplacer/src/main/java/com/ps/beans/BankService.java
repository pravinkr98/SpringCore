package com.ps.beans;

import org.springframework.stereotype.Component;

@Component("bank")
public class BankService {
		
	public BankService() {
		System.out.println("BankService:: 0-param constructor");
	}
	
	public float calcInterestAmount(float pAmt,float time) {
		System.out.println("BankService.calcInterestAmount() ----->Original logic");
		return (pAmt*time*1.0f)/100.0f;
	}

}
