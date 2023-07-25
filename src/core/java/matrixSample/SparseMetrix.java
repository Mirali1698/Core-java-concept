package core.java.matrixSample;

public class SparseMetrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[][] {{1,2,0},{0,0,8},{9,0,0}};
		
		int count =0;
		int size = a.length*a[0].length;
		for(int i= 0; i<a.length; i++) {
			for(int j =0; j<a[0].length; j++) {
				if(a[i][j] == 0) {
					count++;
				}
			}
		}
		
		
		if(count > (size/2)) {
			System.out.println("The metrix is sparse metrix");
		}
		else
			System.out.println("Metrix is not sparse matrix");

	}

}
