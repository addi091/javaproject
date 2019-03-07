package com.capgemini.insurance.bean;

public class BikesInfo {
	private String bikeName;
	private int engineCC;
	private double price;
	private String year;
	public BikesInfo(String bikeName, int engineCC, double price) {
		super();
		this.bikeName = bikeName;
		this.engineCC = engineCC;
		this.price = price;
		//this.year = year;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "BikesInfo [bikeName=" + bikeName + ", engineCC=" + engineCC
				+ ", price=" + price + ", year=" + year + "]";
	}
	
	
	
	
	

}
