package Algorithms;

public class OneDArray {
	//declaring the syntax
	public static void main(String args[]) {
	//initlizing and declaring in one step		
		int[]myArray = {10,20,30,40};
		
		
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		//changing the thrid element from 40 to 900
		myArray[3] = 900;
		
		System.out.println("Updated Array:");
		//assessing through the newe array
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}
}