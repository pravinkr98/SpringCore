package com.ps.beans;

import java.util.Date;
import java.util.Map;

public class PersonProfile {
	private Map<String,Long> phones;
	private Map<Long,String> bankAccount;
	private Map<String,Date> impDates;
	
	public PersonProfile() {
		System.out.println("PersonProfile::0-param constructor<Map>");
	}
	
	public void setPhones(Map<String, Long> phones) {
		this.phones = phones;
	}
	public void setBankAccount(Map<Long, String> bankAccount) {
		this.bankAccount = bankAccount;
	}
		
	public void setImpDates(Map<String, Date> impDates) {
		this.impDates = impDates;
	}

	@Override
	public String toString() {
		return "PersonProfile [phones=" + phones + ", bankAccount=" + bankAccount + ", impDates=" + impDates + "]";
	}

	
	
	

}
