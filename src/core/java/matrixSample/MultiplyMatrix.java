package core.java.matrixSample;

public class MultiplyMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[][] { { 10, 12, 9 }, { 4, 8, 12 }, { 7, 8, 9 } };
		int[][] b = new int[][] { { 9, 6, 4 }, { 5, 7, 9 }, { 1, 3, 4 } };

		int mul[][] = new int[a.length][a[0].length];

		if (a[0].length == b.length) {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					mul[i][j] = 0;
					for (int k = 0; k < a[i].length; k++) {

						mul[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		System.out.println("The sum of two matrices is:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}

	}

}
