package Algorithms;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String args[]) {
	int n = 5;

	  //declaring ArrayList of size n
	  ArrayList<Integer>array = new ArrayList<Integer>(n);

	  // Appending the new element at the end of the list 
	  for (int i = 1; i <= n; i++)
		  array.add(i);

	  // Printing elements 
	  System.out.println(array);

	  // Remove element at index 3 
	  array.remove(3);

	  // Displaying ArrayList after deletion 
	  System.out.println(array);

	  // Printing elements one by one 
	  for (int i = 0; i < array.size(); i++)
	   System.out.print(array.get(i) + " ");
	 }
}
