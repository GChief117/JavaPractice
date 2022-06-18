package Algorithms;

import java.util.Stack;

public class StackClass {
	
public static void print(Stack < Integer > myStack) {
	  Stack < Integer > tempStack = myStack;
	  while (tempStack.empty() == false) {
	   System.out.println(tempStack.peek());
	   tempStack.pop();
	  }
	  System.out.println();
	 }
	 public static void main(String[] args) {
	  Stack < Integer > myStack = new Stack < Integer > ();;
	  myStack.push(1);
	  myStack.push(2);
	  myStack.push(3);
	  System.out.println("myStack size is : ");
	  System.out.println(myStack.size());
	  System.out.println();
	  System.out.println("myStack is : ");
	  print(myStack);

	 }
	}