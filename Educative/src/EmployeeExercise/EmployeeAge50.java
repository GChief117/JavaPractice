package EmployeeExercise;

import java.util.ArrayList;
import java.util.List;

//we need find all the employees whose age is more than 50

//the employee class we have can be accessed by the other classes

//so therefore, can do e



public class EmployeeAge50 {
	
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Alex", 23, "USA"));
		list.add(new Employee("Dave", 34, "India"));
		list.add(new Employee("Carl", 21, "USA"));
		list.add(new Employee("Joe", 56, "Russia"));
		list.add(new Employee("Amit", 64, "China"));
		list.add(new Employee("Ryan", 19, "Brazil"));
		
		//what we need to do
		//for loop
		//compare
		
		
		//if doing a for each loop can do
		// for(Class (symbol): list)
		for(Employee e: list) {
			if (e.age >50) {
				System.out.println(e.name);
			}
		}
		
	}

}
