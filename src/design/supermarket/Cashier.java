package design.supermarket;

import java.util.ArrayList;

public class Cashier {
	//Generate a bill
	//Pay method - which will actually take money
	GroceryStore store;
	
	public void takePosition(GroceryStore groceryStore){
		store = groceryStore;
	}
	
	public double generateBill(ArrayList<GroceryItem> shoppingBasket){
		double total = 0.0;
		
		for(GroceryItem item:shoppingBasket){
			total += item.getPrice();
		}
		
		return total;
	}
	
	public void acceptMoney(double total){
		store.money += total;
		System.out.println("Total Money with store is: " + store.money);
	}
}
