package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		
		System.out.println("The element at index 2 is" + list.get(2));
		System.out.println("The size of the list is" + list.size());

		
	}
}