package com.ps.bo;

public class StudentBO {
	private int sno;
	private String sname;
	private String sadd;
	private int total;
	private float avg;
	private String result;
	
	public void setSno(int sno) {
		this.sno=sno;
	}
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
	public int getSno() {
		return sno;
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
