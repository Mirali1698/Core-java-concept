package core.java.matrixSample;

public class SumRowColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[][] {{1,2,3},{9,6,1},{8,7,5}};
		
		int sumRow, sumCol;
		for(int i = 0; i<a.length; i++) {
			sumRow = 0;
			for(int j = 0; j<a[0].length; j++) {
				sumRow += a[i][j];
			}
			System.out.println("The sum of " +(i+1) +" row is: " +sumRow);
		}
		System.out.println();
		for(int i = 0; i<a.length; i++) {
			sumCol = 0;
			for(int j = 0; j<a[0].length; j++) {
				sumCol += a[j][i];
			}
			System.out.println("The sum of " +(i+1) +" column is: " +sumCol);
		}
	}

}
