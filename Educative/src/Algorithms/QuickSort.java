package Algorithms;

import java.util.Random;

public class QuickSort {
	static Helper obj = new Helper();
	
	public static int seletPivot(int left, int right) {
	Random rando = new Random();
	
	
	//given we are dividing up our array by three parts,
	//we have the left, right, and what we have pivoted 
	int i1 = left + (rando.nextInt(right - left + 1));
	int i2 = left + (rando.nextInt(right - left + 1));
	int i3 = left + (rando.nextInt(right - left + 1));
	
	return Math.max(Math.min(i1,  i2), Math.min(Math.max(i1, i2), i3));
	
	}
	
	public static int dividethisbitch(int array[], int left, int right) {
		int pivotInd = seletPivot(left, right); //calls in the method we made, with teh parameters left and right
		obj.swap(array, right, pivotInd);
		int divide = array[right];
		int i = (left - 1);
		
		//now goign up the loop of the array
		for (int j = left; j <= right -1; j++) {
			if (array[j] <= divide) {
				i++; //move up the index to see where the pivot needs to be located to 
				obj.swap(array,  i,  j);
				
			}
		}
		obj.swap(array,  i + 1,  right); //where we put he pivot in the right position 
		return (i + 1);
	}
		
		//how we do our quicksort
		public static void quickSort(int array[], int left, int right) {
			if (left < right) {
				//locaiton of the pivot
				int pos = dividethisbitch(array, left, right);
				
				
				quickSort(array, left, pos-1);
				quickSort(array, pos + 1, right);
				
			}
		}
			
		 public static void main(String args[]) {
			  int array[] = {5,4,1,0,5,95,4,-100,200,0};
			  int arraySize = 10;
			  quickSort(array, 0, arraySize - 1); //quick sort has 3 placehodlers
			  System.out.print("Sorted array: ");
			  obj.printArray(array, arraySize);
			
		
		
	}
	
	
	
	
	
	

}
