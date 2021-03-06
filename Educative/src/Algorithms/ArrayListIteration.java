package Algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
	@SuppressWarnings("removal")
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(10);
		
		Iterator<Integer> itr = list.iterator();
		
		//how we delete an element from the array list
		
		while (itr.hasNext()) {
			int next = itr.next();
			
			if (next == 30) { //if not int
				itr.remove(); //this is how we remoeve a specific element
			}
		}
		System.out.println(list);
		
		
		
		
	}
}