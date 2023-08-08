package core.java.numberProgram;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Automorphic - the square of any number is end with the same number

		//to print automorphic numbers between 0 to 1000
		System.out.println("Automorphic numbers from 0 to 1000 are: ");
		for(int i=1; i<=1000; i++) {
			if(numIsAutomorphic(i))
				System.out.print(i+ " ");
		}
	}

	private static boolean numIsAutomorphic(int i) {
		// TODO Auto-generated method stub
		
		//find the square value of given number
		int square = i * i;
		int digit = 0;
		int temp = i;
		
		//find the digits of the number
		while(temp>0) {
			digit++;
			temp = temp/10;
		}
		
		//find the 10^digit
		int power = 1;
		for(int j=1; j<=digit; j++) {
			power = power*10;
		}
		
		//to find the last digit of square
		
		int sqLastDig = square%power;
		
		//if last digits of square value and i are same return true
		if(i == sqLastDig)
			return true;
		else
			return false;
	}


}
