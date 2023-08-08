package core.java.matrixSample;

public class EqualMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[][] { { 9, 6, 4 }, { 5, 7, 9 }, { 1, 3, 4 } };
		int[][] b = new int[][] { { 9, 6, 4 }, { 5, 7, 9 }, { 1, 3, 4 } };

		boolean flag = true;

		if ((a.length == b.length) && (a[0].length == b[0].length)) {

			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[0].length; j++) {
					if (a[i][j] != b[i][j]) {
						flag = false;
						break;
					}
				}
			}

		}
		if (flag)
			System.out.println("Both are identical");
		else
			System.out.println("Not identical");
	}

}
