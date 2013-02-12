package design.address.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
	
	public static Map<String, Contact> contactList;
	
	public static void main(String[] args){
		
		//Lets say the String value is a concatentation of the first value and second value
		contactList = new HashMap<String, Contact>();
		
		Contact c1 = new Contact("Akshay", "Suresh", "Northwest blvd", "ak@test.com", "6143299942");
		Contact c2 = new Contact("Komal", "Bhatia", "Northwest blvd", "ak@test.com", "6143299942");
		Contact c3 = new Contact("test", "user", "Northwest blvd", "ak@test.com", "6143299942");
		Contact c4 = new Contact("Akshay", "tesla", "Northwest blvd", "ak@test.com", "6143299942");
		
		addContact(c1);
		addContact(c2);
		addContact(c3);
		addContact(c4);
		
		ArrayList<Contact> searchableContacts = searchContact("Akshay");
		for(Contact c : searchableContacts){
			System.out.println("Found " + c.getFirstName() + " " + c.getLastName());
		}
		
		/*ArrayList<Contact> searchableContacts2 = searchContact("Komal");
		for(Contact c : searchableContacts2){
			System.out.println("Found " + c.getFirstName() + " " + c.getLastName());
		}*/
		
	}
	
	public static void addContact(Contact c){
		String name = c.getFirstName() + " " + c.getLastName();
		contactList.put(name, c);
		System.out.println("Added " + name);
	}
	
	public static ArrayList<Contact> searchContact(String name){
		ArrayList<Contact> listOfContacts = new ArrayList<Contact>();
		for(String storedName : contactList.keySet()){
			if(storedName.toLowerCase().contains(name.toLowerCase())){
				listOfContacts.add(contactList.get(storedName));
			}
		}
		return listOfContacts;
	}

}
