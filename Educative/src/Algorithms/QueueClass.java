/**
 * 
 */
package Algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author gunnar_beck7
 *
 */
public class QueueClass {
	
	
	//you cannot have objects made in java
	//and the class fiel the same
	
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		
		//Adding elements to the queue
		for (int i = 0; i < 5; i ++) {
			q.add(i);
		}
		
		System.out.println("Elements of queue: " + q);
		
		
		//removing the head of th queue
		int del = q.remove();
		System.out.println("remove element is: " + del);
		
		//rprinting the queue
		System.out.println(q);
		
		//Seeing where the head of the queue is
		int head = q.peek();
		System.out.println("head of queue is: " + head);
		
		
		//checking size of the queue
		int size = q.size();
		System.out.println("Size of queue: " + size);

		
		
	}
	
	

}
