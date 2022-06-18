package Algorithms;


public class SelectionSort {
	
	static Helper obj = new Helper();
	static void selectionSort(int[] array, int arraySize) {
		int smaller;
		
		//traverse through elements in array
		for (int i = 0; i < arraySize; i++) {
			smaller = obj.findMin(array,  i,  arraySize -1);
			int position = array[i];
			array[i] = array[smaller];
			array[smaller] = position;
		}		
	}
	//print out an example

	public static void main(String args[]) {
		int array[] = {1,2,3,4,57,41,21};
		int arraySize = 7;
		selectionSort(array, arraySize);
		obj.printArray(array, arraySize);
	
			}
}
