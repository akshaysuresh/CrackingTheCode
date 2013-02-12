package design.library.management;

public class Patron {
	
	String name;
	
	public static void main(String[] args){
		Library.initialize();
		Library.checkoutBook(1, new Patron());
		Library.checkoutBook(2, new Patron());
		
		Library.returnBook(1);
	}

}
