package core.java.basicPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print prime numbers till n
		int n = 17, counter;
		
		//for i check every j till n and set counter to 0 for every i
		for (int i = 1; i <= n; i++) {
			counter=0;
			
			//check if i divided by j increase counter by one
			//if i will not divided by j then skip increment of counter
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					counter++;
				}
			}
			
			//if counter is equal to 2 then it is prime number bcz the number can be divided by 1 and itself
			//so, counter will increase only 2 times till 2
			//if it is not prime number then counter should be 1 bcz it will skip increment counter part
			if (counter == 2) {
				System.out.println(i);
			}
			
		}
	}

}
