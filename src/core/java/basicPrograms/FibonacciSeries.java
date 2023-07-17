package core.java.basicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Fibonacci series
		// 0 1 1 2 3 5 8 13 21 .....

		// count is for how many numbers printed for fibonacci series
		int count = 15, a = 0, b = 1;

		// print first two numbers
		System.out.print(a + " ");
		System.out.print(b + " ");

		// execute for loop 13 times to print 15 numbers of fibonacci series

		for (int i = 0; i < count - 2; i++) {
			int c = a + b;

			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}
}
