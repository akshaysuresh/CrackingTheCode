package com.akshay.suresh.design.supermarket;

public class GroceryItem {

	String name;
	double price;

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	
	GroceryItem(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	
}