package core.java.control;

public class Lec04_SamplePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * print the pattern
		 * 
		 ** 
		 *** 
		 **** 
		 *****
		 */
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();
		
		/*Print the pattern
		 1
		 1 2
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5
		 */
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((j+1) +" ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println();

		
		/* print the pattern
		    *
		   **
		  ***
		 ****
		*****
		 */
		
		for(int i = 0;i<=4; i++) {
			for(int k=4; k>i; k-- ) {
				System.out.print(" ");
			}
			for(int j= 0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//print 0 to 9 using while loop
		//increment before print
		
		System.out.println("Print 0 to 9 using while loop");
		int i=0;
		while(i<10) {
			i++;
			System.out.println(i-1);
		}
		// Print 0 to 9 using do-while loop
		//increment before print 
		
		i = 0;
		System.out.println("Print 0 to 9 using do-while loop");
		
		
		do {
			i++;
			System.out.println(i-1);
		}while(i<10);
	}

}
