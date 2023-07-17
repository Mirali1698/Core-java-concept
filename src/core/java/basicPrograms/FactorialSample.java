package core.java.basicPrograms;

public class FactorialSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Print factorial of number
		//n = n* (n-1)*(n-2)*...*1
		int num = 7, sum = 1;
		for (int i = num; i > 1; i--) {
			sum = sum * i;
		}
		System.out.println(sum);

	}

}
