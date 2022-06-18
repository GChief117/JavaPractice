/**
 * 
 */
package Algorithms;

/**
 * @author gunnar_beck7
 *
 */
class TwoDArray {
	public static void main(String args[]) {

		int[][] my2DArray = new int[10][];
		
		//fixing null point exception
		//need columns and rows
		
		for (int i = 0; i <10; i++) {
			my2DArray[i] = new int [10]; //adding 10 to the column
			for(int j = 0; j < 10; j++) {
				my2DArray[i][j] = i + j;
				System.out.println(my2DArray[i][j]);
			}
		}


	}
}
