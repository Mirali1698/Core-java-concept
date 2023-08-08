package core.java.numberProgram;

public class PetersonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Peterson Number - if the sum of every digits's factorial value is equal to
		// the number
		// is called Peterson number

		// find peterson number between 0 to 100

		for (int i = 0; i <= 100; i++) {
			if (numIsPeterson(i))
				System.out.print(i + " ");
		}
	}

	private static boolean numIsPeterson(int i) {
		// TODO Auto-generated method stub

		int temp = i;
		int rem;
		int factValue = 0;

		// execute the loop for every digit
		while (temp > 0) {

			// to get the last digit of the number
			rem = temp % 10;

			// get the factorial value of the last digit
			int fact = 1;
			for (int j = rem; j > 0; j--) {
				fact = fact * j;
			}

			// store the sum of factorial value
			factValue = factValue + fact;

			// update the temp value and remove the last digit of the number
			temp = temp / 10;
		}

		// sum of the factorial value is equal to the number return true
		if (factValue == i)
			return true;
		else
			return false;
	}

}
