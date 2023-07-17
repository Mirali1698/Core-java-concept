package core.java.basicPrograms;

public class PalindromeCheck {

	public static void main(String[] args) {

		//print if the number is palindrome or not
		//if the number and the reverse number both are same it is called palindrome
		int n = 12321, rem, sum = 0;

		//store value in temporary variable
		int temp = n;
		
		//logic to reverse the number
		//execute until temp is greater than 0
		while (temp > 0) {
			
			//getting the last digit through reminder
			//getting 1
			rem = temp % 10;
			//set the new value for temp variable
			//set temp 1232
			temp = temp / 10;
			//store the reverse number in sum
			sum = (sum * 10) + rem;
		}

		//print the reverse number
		System.out.println(sum);

		//to check if both numbers are same
		if (sum == n) {
			System.out.println("Is Palindrome");
		} else {
			System.out.println("Is not Palindrome");
		}
	}

}
