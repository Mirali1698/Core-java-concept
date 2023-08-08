package core.java.matrixSample;

public class AddMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a= new int[][] { {1,2,3}, {4, 5, 6}, {7, 8, 9}};
		int[][] b = new int[][] {{9, 6, 4}, {5, 7, 9}, {1, 3, 4}};
		
		int sum[][] = new int[a.length][a[0].length];
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length ; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("The sum of two matrices is:");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length ; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}

}
