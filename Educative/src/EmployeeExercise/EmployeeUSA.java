package EmployeeExercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//Remove all the meployees from the USA

public class EmployeeUSA {
	
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alex", 23, "USA"));
		list.add(new Employee("Dave", 34, "India"));
		list.add(new Employee("Carl", 21, "USA"));
		list.add(new Employee("Joe", 56, "Russia"));
		list.add(new Employee("Amit", 64, "China"));
		list.add(new Employee("Ryan", 19, "Brazil"));
		
		
		//we want to remove all the people
		//country in the usa
		
		//use the iterator to remeve a specific item in the list
		Iterator<Employee> itr = list.iterator();
		while(itr.hasNext()) {
			if(itr.next().country.equals("USA")) {
				itr.remove();
			}
		}
		
		
		
		for (Employee e : list) {
			System.out.println("Employee Name: " + e.name + ", Employee Country: " + e.country);
		}
	}
}
