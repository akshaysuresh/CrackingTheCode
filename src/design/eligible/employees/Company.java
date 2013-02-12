package design.eligible.employees;

import java.util.ArrayList;

//If the employee satisfied any two of this conditioms, give him a hike
//Been with the company for 5 yrs
//Published 2 papers
//Received an award 

public class Company {
	
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setName("Akshay");
		e1.setAwardCount(2);
		e1.setNoOfYears(5);
		e1.setReceivedAward(true);
		employees.add(e1); 
		
		Employee e2 = new Employee();
		e2.setName("Komal");
		e2.setAwardCount(0);
		e2.setNoOfYears(1);
		e2.setReceivedAward(true);
		employees.add(e2); 
		
		processHike(employees);
	}

	public static boolean isEligible(Employee e){
		return (e.getAwardCount() >= 2 && e.isReceivedAward() || 
				(e.isReceivedAward() && e.getNoOfYears() >= 5) || 
				(e.getAwardCount()>=2 && e.getNoOfYears()>=5));
	}
	
	public static void processHike(ArrayList<Employee> employees){
		
		for(Employee e :employees){
			if(isEligible(e)){
				System.out.println(e.getName() + " is eligible for hike");
			}
		}
		
	}
	
}
