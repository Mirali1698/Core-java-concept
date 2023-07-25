package core.java.matrixSample;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a = new int[][] {{1,0,0},{0,1,0}, {0,0,1}};
		boolean flag = false;
		
		if(a.length == a[0].length) {
			for(int i = 0; i<a.length; i++) {
				for(int j = 0; j<a[0].length; j++) {
					if(i == j && a[i][j] == 1) {
						flag = true;
						break;
					}
					
					if(i!=j && a[i][j]==0) {
						flag = true;
						break;
					}
					
				}
			}
		}
		
		if(flag) {
			System.out.println("metrix is identical");
		}
		
		else {
			System.out.println("Metrix is identical");
		}

	}

}
