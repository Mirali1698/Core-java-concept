package core.java.matrixSample;

public class UpperTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = new int[][] {{1,2,3},{9,6,1},{8,7,5}};
		if(a.length == a[0].length) {
			
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a[0].length; j++) {
					if(j<i) {
						System.out.print("0 ");
					}
					else {
						System.out.print(a[i][j] + " ");
					}
				}
				System.out.println();
			}
		}

	}

}
