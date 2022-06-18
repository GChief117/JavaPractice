package Algorithms;

public class Helper {
	
	
	
	
	//we have one component in the helper method 
		static int findMin(int[] array, int start, int end) {
			if (end <= 0 || start < 0)
				return 0;
			
			int minInd = start;
			for (int i = start + 1; i <= end; i++) {
				if (array[minInd] > array[i])
					minInd = i;
		}
			return minInd;
	}
		
		//our find max method, makes the 
		int findMax(int [] array, int start, int end) {
			if (end <= 0 || start < 0)
				return 0;
			
			int maxInd = start;
			
			//we make the declaration that as we are runnign through the array if the position of array
			for (int i = start + 1; i <= end; i++){
				//if position of the array is "less" tahn the max, then
				if (array[maxInd] < array[i])
					//the index, the "position" is the max, because max is MAX, you dont fuck with the AMX
					//this si where you make the rules fo the game
					
					maxInd = i;
			} return maxInd;
		}
		
		
		//swap method
		 static void swap(int[] array, int i, int j) {
			  int temp = array[i];
			  array[i] = array[j];
			  array[j] = temp;
			 }
		
		
		
		
		//print method
		static void printArray(int[] arr, int arraySize) {
			for (int i = 0; i < arraySize; i++) 
				System.out.print(arr[i] + " ");
			System.out.println();
			}

}



