package core.java.basicPrograms;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		
		int i = random.nextInt(100);
		System.out.println("Random number using Random class: "+i);
		
		System.out.println("Random using math function: " +(Math.random()));
	}

}
