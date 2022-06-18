package Algorithms;

public class Vehicle implements Comparable<Vehicle>{
	String brand;
	Integer year;
	
	public Vehicle(String brand, Integer year) {
		super();
		this.brand = brand;
		this.year = year;
		//its what we declare
	}

	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}

}
