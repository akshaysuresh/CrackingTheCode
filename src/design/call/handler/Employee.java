package design.call.handler;

public class Employee {

	public int rank;
	
	boolean free;
	
	public String name;
	
	public Employee(){
		
	}
	public Employee(int rank, String name, boolean free){
		this.rank = rank;
		this.name = name;
		this.free = free;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public boolean isFree() {
		return free;
	}
	public void setFree(boolean free) {
		this.free = free;
	}
}
