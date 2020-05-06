package com.ps.beans;

public class Car {
	private String regNo;
	private String ownerName;
	private String modelName;
	private String color;
	private String engineCc;
	private String makeCompany;
	private String type;
	private String fuelType;
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setEngineCc(String engineCc) {
		this.engineCc = engineCc;
	}
	public void setMakeCompany(String makeCompany) {
		this.makeCompany = makeCompany;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public String toString() {
		return "Car [regNo=" + regNo + ", ownerName=" + ownerName + ", modelName=" + modelName + ", color=" + color
				+ ", engineCc=" + engineCc + ", makeCompany=" + makeCompany + ", type=" + type + ", fuelType="
				+ fuelType + "]";
	}
	
	
	
	
}
