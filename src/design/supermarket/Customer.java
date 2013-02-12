package design.supermarket;

import java.util.ArrayList;

public class Customer {

	//addItemstoCart
	//checkout
		//Cashier.getBill
		//Cashier.pay
	
	double myMoney = 50.0;
	ArrayList<GroceryItem> myShoppingBasket;
	
	public void shop(GroceryStore store){
		addItemsToCart(store);
		checkout(store);
	}
	
	private void addItemsToCart(GroceryStore store){
		myShoppingBasket = new ArrayList<GroceryItem>();
		
		for(int i=0; i< GroceryStore.KIND_OF_ITEMS; i++){
			myShoppingBasket.add(store.item[i]);
			store.itemCount[i] = store.itemCount[i] -1;
		}
	}
	
	private void checkout(GroceryStore store){
		Cashier cashier = store.getCashier();
		double total = cashier.generateBill(myShoppingBasket);
		myMoney = myMoney - total;
		System.out.println("Money left with me is " + myMoney);
		cashier.acceptMoney(total);
	}
	
}
