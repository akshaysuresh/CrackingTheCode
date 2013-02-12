package design.eligible.employees;

//If the employee satisfied any two of this conditioms, give him a hike
// Been with the company for 5 yrs
// Published 2 papers
// Received an award 

public class Employee {

	private String name;
	private boolean receivedAward;
	private int awardCount;
	private int noOfYears;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isReceivedAward() {
		return receivedAward;
	}
	public void setReceivedAward(boolean receivedAward) {
		this.receivedAward = receivedAward;
	}
	public int getAwardCount() {
		return awardCount;
	}
	public void setAwardCount(int awardCount) {
		this.awardCount = awardCount;
	}
	public int getNoOfYears() {
		return noOfYears;
	}
	public void setNoOfYears(int noOfYears) {
		this.noOfYears = noOfYears;
	} 
	
	
	
}
