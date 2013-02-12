package design.library.management;

public class Book {
	
	int id;
	String name;
	Patron holder;
	
	Book(int id, String name, Patron holder){
		this.id = id;
		this.name = name;
		this.holder = holder;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Patron getHolder() {
		return holder;
	}
	public void setHolder(Patron checked) {
		this.holder = checked;
	}
	
	

}
