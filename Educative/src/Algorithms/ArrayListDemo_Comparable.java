package Algorithms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//this part wont compile because there is no comparable interface to set
	//the comparable interface allows us to add multiple values inside of 
	//a given list we want to create

public class ArrayListDemo_Comparable{
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("James", 29));
		list.add(new Employee("Karren", 39));
		
		Collections.sort(list);
		//need a for each loop to have the whole list be traversed to sort
		//when we have 2 different values in set sort
		for(Employee emp : list) {
		System.out.println("Employee Name: " + 
		emp.name + ", Employee Age: " + emp.age);
		}
		
		
		//you need to specify 
		//emp.name because you cannot do list
		//otherwise you are going to get more numbers
		//which are not categorized as strings or integers
		
		
	}
}