package core.java.control;

public class SampleForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print numbers between 5 to 10
		// use of for loop
		for (int i = 5; i <= 10; i++) {
			System.out.println("The number is: " + i);
		}
		// print 10 to 5 in reverse order
		int a = 3;

//		for (int i = 0; i < 5; a++) {
//			System.out.println(i);
//		}

		for (int i = 0; i <= 25; i++) {
			System.out.print(a);
			System.out.println(i);
			if(i==10) {
				break;
			}
		}
		System.out.println("End of the loop");
		
		for (int i = 0; i <= 25; i++) {
						
			if(i==10) {
				continue;
			}
			System.out.print(a);
			System.out.println(i);
		}
		System.out.println("End of the loop After continue");
		
		
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.println("outer loop: " + i + " inner loop: " + j);
//			}
//		}
	}

}
