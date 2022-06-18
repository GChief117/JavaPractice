package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_Sorting {
	//descending order
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>(); 
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(22);
		list.add(19);
		list.add(8);
		list.add(1);
		
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Array List in descending order" + list);

		
		
	}
	
	
	
	
	
	/**Ascending
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(2);
		list.add(26);
		list.add(21);
		list.add(22);
		list.add(35);
		list.add(56);

		
		//method to sort list in ascending order
		Collections.sort(list);
		System.out.println("Array List in ascending order" + list);
		
	}
	
	**/
	

}
