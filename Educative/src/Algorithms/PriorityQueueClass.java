package Algorithms;
import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueClass{
	public static void main(String [] args){
		PriorityQueue<String> pq = new PriorityQueue<String>();

		pq.add("G");
		pq.add("H");
		pq.add("T");
		pq.add("R");
		pq.add("N");
		pq.add("B");



		//Printing highest priority element
		System.out.println("Highest prioroity element:" + pq.peek());


		//prek is highest prioroity

		//printing all elements here
		System.out.println("Elements in queue are:");
		Iterator itr = pq.iterator(); //helps check all of our elements (iterating through a list)
		while(itr.hasNext())
			System.out.println(itr.next());

		//removing teh top proirity element
		pq.poll();
		//printing teh queue
		System.out.println("After removing an element with poll fucntion:");
		Iterator <String> itr2 = pq.iterator();
		while(itr2.hasNext())
			System.out.println(itr2.next());



		///removing element using remove()
		pq.remove("G");
		System.out.println("After removing an element with remove function:");
		Iterator<String> itr3 = pq.iterator();
		while (itr3.hasNext())
			System.out.println(itr3.next());


		//Chekcing to see if the element is present (true or false)
		boolean temp = pq.contains("C");
		System.out.println("Priority queue contains C or not--" + temp);




	}








}