package core.java.collections;

import java.util.*;

public class DemoQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queueOfInteger = new LinkedList<Integer>();
		queueOfInteger.add(10);
		queueOfInteger.add(20);
		queueOfInteger.add(30);
		queueOfInteger.add(40);
		queueOfInteger.add(50);
		
		System.out.println("head of queue is: " +queueOfInteger.peek());
		System.out.println("Head of queue uing poll: " +queueOfInteger.poll());
		System.out.println("head of queue is: " +queueOfInteger.peek());
	}

}
