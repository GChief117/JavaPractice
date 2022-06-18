package Algorithms;

public class BinarySearch {
	
	public static int BinarySearch(int array[], int left, int right, int key) {
		if (right >= left) {
			int MidElement = left + (right - left)/2;
			if (array[MidElement] == key) //finding the key to the right index
				return MidElement;
			if (key < array[MidElement])
				return BinarySearch(array, left, MidElement - 1, key);
			return BinarySearch(array, MidElement + 1, right, key);
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int array[] = {3,4,5,67,25};
		int key = 67; //will give the position of 4, which is at 1but if we put 67 the index will be 3, 25 will be at index 4. 
		int result = BinarySearch(array, 0, array.length-1, key);
		if(result != -1)
			System.out.println("Key " + "\"" + key + "\" found index = " + result );
		else 
			  System.out.println("Key " + "\"" + key + "\"not found!");

		//different key value
		key = 0;
		result = BinarySearch(array, 0, array.length-1, key);
		 if (result != -1)
			  System.out.println("Key " + "\"" + key + "\" found at index = " + result);
			 else
			  System.out.println("Key " + "\"" + key + "\"not found!");			
			
		}
		
		
		
	}
	

