package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		
		list.set(1, 100); //we have our range, this is our set--- .set(int index, E element);
		//we will have 20 being replaced by 100
		
		System.out.println(list);
		if (list.contains(30)) {
			System.out.println("List contains 30");
		}
		
		System.out.println("Index of first occurence of 10 is " + list.indexOf(10)); //checks the posiion of a given index
		//going to print out exaclt where the element is located, index
		System.out.println("Index of first occurence of 10 is " + list.lastIndexOf(10));
		//when the last time 10 shows up in the arraylist


		

		
	}
}