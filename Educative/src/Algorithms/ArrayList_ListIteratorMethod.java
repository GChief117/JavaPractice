package Algorithms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ListIteratorMethod {
	public static void main(String args[]) {
	List<Integer> list = new ArrayList<>();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	
	//creating new objects with a cohost of methods
	//onyl use new when creating a list or object/instantiating at the top
	Iterator<Integer> itr = list.iterator();
	
	//list iterator 
	ListIterator<Integer> listIterator =  list.listIterator();
	
	
	//Traversing through the elements in a given list
	System.out.println("Forward Direction Iteration:");
	while (listIterator.hasNext()) {
	System.out.println("next element is "+ listIterator.next() + 
			" and next index is " + listIterator.nextIndex());
	
	
	//Traversing elements, tierator is at the end point
	
	System.out.println("Backward Iteration: ");
	while (listIterator.hasPrevious()) {
		System.out.println("Previous element is " + listIterator.previous() +
				" and previous index is" + listIterator.previousIndex());
		
	}

	}
}
}
