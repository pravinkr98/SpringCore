package com.ps.beans;

import java.util.Date;
import java.util.Set;

public class MinistryOfHR {
 private Set<Long> aadharNos;
 private Set<Date> impDates;
 
 public MinistryOfHR() {
	System.out.println("MinistryOfHR::0-param contructor<Set>");
}
 
public void setAadharNos(Set<Long> aadharNos) {
	this.aadharNos = aadharNos;
}
public void setImpDates(Set<Date> impDates) {
	this.impDates = impDates;
}
@Override
public String toString() {
	return "MinistryOfHR [aadharNos=" + aadharNos + ", impDates=" + impDates + "]";
}
 

}
