package core.java.collections;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stackOfInteger = new Stack<Integer>();
		stackOfInteger.push(10);
		stackOfInteger.push(20);
		stackOfInteger.push(30);
		stackOfInteger.push(40);
		stackOfInteger.push(50);
		
		System.out.println("Last element in stack is: " +stackOfInteger.peek());
		System.out.println("Last element in stack with pop is: " +stackOfInteger.pop());
		System.out.println("Last element in stack is: " +stackOfInteger.peek());
		System.out.println(stackOfInteger);
	}

}
