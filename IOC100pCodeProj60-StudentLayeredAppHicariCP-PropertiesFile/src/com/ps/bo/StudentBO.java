package com.ps.bo;

public class StudentBO {
	private String sname;
	private String sadd;
	private int total;
	private float avg;
	private String result;
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	public void setSadd(String sadd) {
		this.sadd=sadd;
	}
	public void setTotal(int total) {
		this.total=total;
	}
	public void setAvg(float avg) {
		this.avg=avg;
	}
	public void setResult(String result) {
		this.result=result;
	}
	public String getSname() {
		return sname;
	}
	public String getSadd() {
		return sadd;
	}
	public int getTotal() {
		return total;
	}
	public float getAvg() {
		return avg;
	}
	public String getResult() {
		return result;
	}

}
