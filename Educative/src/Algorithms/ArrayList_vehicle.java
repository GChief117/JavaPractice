package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_vehicle{
	public static void main(String args[]) {
		List<Vehicle> list = new ArrayList<>();
		
		list.add(new Vehicle("BMW", 2019));
		list.add(new Vehicle("Caddy", 2020));
		list.add(new Vehicle("Corvette", 2022));
		list.add(new Vehicle("Ferrari", 2006));
		list.add(new Vehicle("Lambo", 2001));

		Collections.sort(list);
		for (Vehicle vehicle: list) {
			System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.year);
		}
		
		
		
		
	}

}
