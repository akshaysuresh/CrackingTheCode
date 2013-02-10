package com.akshay.suresh.design.library.management;

import java.util.HashMap;
import java.util.Map;

public class Library {
	
	static Map<Integer,Book> books;
	
	public static void initialize(){
		Book book1 = new Book(1,"Abc", null);
		Book book2 = new Book(2,"Abc12", null);
		Book book3 = new Book(3,"Abc1", null);
		Book book4 = new Book(4,"Abc123", null);
		books = new HashMap<Integer,Book>();
		
		books.put(1, book1);
		books.put(2, book2);
		books.put(3, book3);
		books.put(4, book4);

	}
	
	public static void checkoutBook(int bookId, Patron patron){
		Book book = books.get(bookId);
		if(book.getHolder() == null){
			book.setHolder(patron);
		}
		//bookCount[book.getId()] = bookCount[book.getId()] - 1;
		System.out.println("Book id: " + bookId + " has been checked out");
	}

	public static void returnBook(int bookId){
		Book book = books.get(bookId);
		book.setHolder(null);
		//bookCount[book.getId()] = bookCount[book.getId()] + 1;
		System.out.println("Book id: " + bookId + " has been Returned");
	}

}
