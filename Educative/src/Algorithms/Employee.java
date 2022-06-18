package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> { 
	//you need to implement this interface
	//with a given parameter
	
	String name;
	int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	//this is our comparable interface
	@Override
	public int compareTo(Employee emp) {
		
		return (this.age - emp.age);
	}
	

}
