package BigO;

import java.util.PriorityQueue;
import java.util.Random;

public class ProblemSet3_Q1 {
	
	/**
	 * 
	 * In the lesson on Merge Sort, we implemented merge sort 
	 * where we divided the array into two parts at each recursion step. 
	 * Imagine you are asked to implement merge sort by dividing the 
	 * problem into three parts instead of two. You can assume for 
	 * simplicity that the input size will always be a multiple of 3. 
	 * Use a priority queue to merge sub-arrays in the combining step.
	 * 
	 */
    private static int SIZE = 100;
    static private int[] input = new int[SIZE];
    static PriorityQueue<Integer> q = new PriorityQueue<>(SIZE);
    private static Random random = new Random(System.currentTimeMillis());

	
	
	public static void main(String [] args) {
		createTestData();
		long start = System.currentTimeMillis();
		mergeSort(0, input.length - 1, input);
		long end = System.currentTimeMillis();
		System.out.println("Time - " + (end - start));
		printArray(input);
	}
	
	
	private static void createTestData() {
		for (int i = 0; i < SIZE; i ++) {
			input[i] = random.nextInt(10000);
		}
	}
	
		
private static void mergeSort(int start, int end, int[] input) {
	if (start >= end) {
		return;
	} else if (start + 1 == end) {
		if (input[start] > input[end]) {
			int temp = input[start];
			input[start] = input[end];
			input[end] = temp;
		} return;
	}
	
int mid = (end - start) / 3;

//sort the first half
mergeSort(start, start + mid, input);


//sort the second half
mergeSort(start + mid + 1, start + 1 + (2 * mid), input);



//sort third half
mergeSort(start + 2 + (2 * mid), end, input);



//merge the three sorted arrays using a priority queue
int k;


for (k = start; k <= end; k ++) {
	q.add(input[k]);
}
}




private static void printArray(int[] input) {
	System.out.println(0);
	for ( int i = 0; i < input.length; i++) {
		System.out.println((" " + input[i] + " "));
	System.out.println();
	}




/**
 * 
a- Provide implementation for the 3-way division merge sort.

b- Provide a generalized expression for the number of recursion levels.

c- Work out the time complexity for the 3-way merge sort.

d- Will implementing merge sort by dividing the problem into a greater 
number of subproblems improve execution time?
 * 
 * 
 */
		
		
		




	}


}
