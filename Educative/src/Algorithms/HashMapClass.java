package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
	
	public static void print(Map <String, Integer> map) {
	if (map.isEmpty()) {
		System.out.println("Map is empty");
	} else {
		System.out.println(map);
	}
	}
	
	
	public static void main(String args[]) {
		//mkaing the hashmap
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Paris", 1);
		map.put("Harrisonburg", 13);
		map.put("MainStreet", 2);
		
		//size of the map
		System.out.println("Size of map:" + map.size());
		
		print(map);
		if (map.containsKey("Paris")) {
			Integer a = map.get("Paris");
			System.out.println("Value for key \"Paris\" is: " + a);
		}
		
		//removing all mapings
		map.clear();
		System.out.println("Clearing the map");
		print(map);
		
		
		
	}

}
