package com.project.mobile;

public class Mobile {	
	private String manufacturer;
	private String operating_system;
	public String model;
	private int cost;
	//Constructor to set properties/characteristics of object
	protected Mobile(String man, String o,String m, int c){
		this.manufacturer = man;
		this.operating_system=o;
		this.model=m;
		this.cost=c;
	}
	//Method to get access Model property of Object
	public String getModel(){
		return this.model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getOperating_system() {
		return operating_system;
	}
	public void setOperating_system(String operating_system) {
		this.operating_system = operating_system;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setModel(String model) {
		this.model = model;
	}	
}
