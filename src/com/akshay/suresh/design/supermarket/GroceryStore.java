package com.akshay.suresh.design.supermarket;

public class GroceryStore {

	public static final int KIND_OF_ITEMS = 4;
	GroceryItem[] item = new GroceryItem[KIND_OF_ITEMS];
	int[] itemCount = new int[KIND_OF_ITEMS];
	double money = 100.00;
	Cashier cashier;
	
	GroceryStore(){
		item[0] = new GroceryItem("Milk", 1.12);
		item[1] = new GroceryItem("Banana", 0.90);
		item[2] = new GroceryItem("Bread", 1.12);
		item[3] = new GroceryItem("Eggs", 0.90);
		for(int i=0; i< KIND_OF_ITEMS; i++){
			itemCount[i] = 50;
		}
	}
	
	public static void main(String[] args){
		
		GroceryStore store = new GroceryStore();
		
		Cashier cashier = new Cashier();
		store.hireCashier(cashier);
		cashier.takePosition(store);
		
		Customer customer = new Customer();
		customer.shop(store);
	}
	
	private void hireCashier(Cashier cashier){
		this.cashier = cashier;
	}
	
	public Cashier getCashier(){
		return cashier;
	}
}
