package design.call.handler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CallHandler {
	
	//this is the main class
	//calls come in here
	//for each call, a rank is assigned to the call
	//Get all the employees of that rank and check if anybody is free to answer that call
	//if they aren't move it 1 level above and look for another person who can handle the call
	
	//Employee will js have functions of receive call, busy status etc
	
	private static final int NO_OF_LEVELS = 3;
	
	//Create a HashMap. Key is level, value is an arrayList of all employees at that level.
	public static Map<Integer, ArrayList<Employee>> employees;
	
	public static void main(String[] args){
		employees = new HashMap<Integer, ArrayList<Employee>>();
		 
		ArrayList<Employee> employeesAtLevel0 = new ArrayList<Employee>();
		ArrayList<Employee> employeesAtLevel1 = new ArrayList<Employee>();
		ArrayList<Employee> employeesAtLevel2 = new ArrayList<Employee>();
		
		Employee e1 = new Employee(0, "Akshay1", false);
		Employee e2 = new Employee(0, "Akshay2", false);
		Employee e3 = new Employee(1, "Akshay3", true);
		Employee e4 = new Employee(2, "Akshay4", true);
		Employee e5 = new Employee(1, "Akshay5", false);
		
		employeesAtLevel0.add(e1);
		employeesAtLevel0.add(e2);
		employeesAtLevel1.add(e3);
		employeesAtLevel1.add(e5);
		employeesAtLevel2.add(e4);
		
		employees.put(0, employeesAtLevel0);
		employees.put(1, employeesAtLevel1);
		employees.put(2, employeesAtLevel2);
		
		Call c = new Call(0);
		Employee handler = handleCall(c.getRank());
		System.out.println("Call was handled by employee " + handler.getName());
	}

	public static Employee handleCall(int callRank){
		for(int i= callRank; i <= NO_OF_LEVELS; i++) {
			for(Employee e : employees.get(i)){
				if(e.isFree()){
					return e;
				} 
			}
		}
		return null;
	}
}
