package core.java.matrixSample;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[][] {{1,2,3},{9,6,1},{8,7,5}};
		
		System.out.println("Original matrix is: ");
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		int[][] transpose = new int[a[0].length][a.length];
		
		for(int i = 0; i<a.length; i++) {
			for(int j = 0; j<a[0].length; j++) {
				transpose[i][j] = a[j][i];
			}
		}
		
		System.out.println("Transpose matrix is: ");
		
		for(int i = 0; i<transpose.length; i++) {
			for(int j = 0; j<transpose[0].length; j++) {
				System.out.print(transpose[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
