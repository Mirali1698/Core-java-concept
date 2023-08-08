package core.java.numberProgram;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int rev = 0, rem;
		
		//execute the loop until last digit
		while (num > 0) {
			
			//get the last digit of the number
			rem = num % 10;
			
			//store the digit in to the reverse number
			rev = (rev * 10) + rem;
			
			//update the num value to remove the last digit
			num = num / 10;

		}
		System.out.println("Reverse number is: " + rev);
	}

}
