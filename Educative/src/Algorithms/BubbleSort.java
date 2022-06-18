package Algorithms;

public class BubbleSort {
	
	 static Helper obj = new Helper();
	 static void bubbleSort(int arr[], int arrSize) {
	  int i, j, temp;
	//traverse through elements in array
	  for (i = 0; i < arrSize - 1; i++)
		//this when the last element in the array is getting replaced
		  for (j = 0; j < arrSize - i - 1; j++)

/**traversing the array from 0 to size of array[i-1] //we are starting from the right
* Swap if the element found is greater on the left side than the one we are traversing through 
* Ex: int [] = {1,2,3,4,5,6,7,10,9}
* Ex: int [] = {1,2,3,4,5,6,7,9,10}
**/
	    if (arr[j] > arr[j + 1]) {
	     temp = arr[j];
	     arr[j] = arr[j + 1];
	     arr[j + 1] = temp;
	    }
	 }
	 public static void main(String args[]) {
	  int arr[] = {5,4,1,0,5};
	  int arrSize = 5;
	  bubbleSort(arr, arrSize);
	  obj.printArray(arr, arrSize);
	 }
	}


/**
class Sorting {

static Helper obj = new Helper();
static void bubbleSort(int[] array, int arraySize) {
int i, j, position;

//traverse through elements in array
for (i = 0; i < arraySize - 1; i++)
	//this when the last element in the array is getting replaced
	for (j = 0; j < arraySize - 1; i ++)
		if (array[j] > array[j + 1]) {
			position = array[j];
			array[j] = array[j + 1];
			array[j + 1] = position;
		}
}

//print out an example

public static void main(String args[]) {
	int array[] = {2,4,124,553,1};
	int arraySize = 5;
	bubbleSort(array, arraySize);
	obj.printArray(array, arraySize);
	
	

}
}
**/