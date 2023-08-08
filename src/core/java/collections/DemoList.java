package core.java.collections;

import java.util.*;

public class DemoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List<Integer> listOfInteger = new List<Integer>();
		List<Integer> listOfInteger = new ArrayList<Integer>();

		// Adding elements into list
		listOfInteger.add(20);
		listOfInteger.add(22);
		listOfInteger.add(28);
		listOfInteger.add(26);
		listOfInteger.add(28);

		System.out.println("size of list of integer: " +listOfInteger.size());
		System.out.println("value at position 3: " +listOfInteger.get(3));
		
		System.out.println();
		//iterate list using for and enhanced for loop
		System.out.println("Print list using for loop");
		for(int i=0; i< listOfInteger.size(); i++) {
			System.out.print(listOfInteger.get(i) +" ");
		}
		System.out.println();
		
		System.out.println();
		System.out.println("Print list using for each loop");
		for(int i: listOfInteger) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println();
		//iterate using iterator
		System.out.println("Print list using iterator");
		Iterator<Integer> it = listOfInteger.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() +" ");
		}
		System.out.println();
		
		System.out.println();
		//create list for string class and print using three methods.
		
		List<String> listOfString = new ArrayList<String>();
		listOfString.add("ABC");
		listOfString.add("DEF");
		listOfString.add("GHI");
		listOfString.add("JKL");
		
		//iterate list using for and enhanced for loop
				System.out.println("Print list using for loop");
				for(int i=0; i< listOfString.size(); i++) {
					System.out.print(listOfString.get(i) +" ");
				}
				System.out.println();
				
				System.out.println();
				System.out.println("Print list using for each loop");
				for(String i: listOfString) {
					System.out.print(i + " ");
				}
				System.out.println();
				
				System.out.println();
				//iterate using iterator
				System.out.println("Print list using iterator");
				Iterator<String> itS = listOfString.iterator();
				while(itS.hasNext()) {
					System.out.print(itS.next() +" ");
				}
		
	}

}
