package com.rushikesh;

public class State {
	private City city;
	public State() {
		System.out.println("0 param State :: Constuctor");
		
	}
	
	public State(City city) {
		System.out.println("Parametraized State :: Constuctor");
		this.city=city;
		
	}
	public void setCity(City city) {
		System.out.println("Setter State Class");
		this.city = city;
	}
	public void getAll() {
		
		System.out.println("All States");
	   
	        city.getName();
	
		
		
		
		
	
	}

	

	
}
