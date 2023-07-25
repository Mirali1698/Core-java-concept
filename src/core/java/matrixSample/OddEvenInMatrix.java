package core.java.matrixSample;

public class OddEvenInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[][] {{1,2,3},{9,6,1},{8,7,5}};
		
		int countEven = 0;
		int countOdd = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				if(a[i][j]%2 == 0)
					countEven++;
				else
					countOdd++;
			}
		}
		
		System.out.println("Even numbers in the matrix are: " +countEven);
		System.out.println("Odd numbers in the matrix are: " +countOdd);

	}

}
