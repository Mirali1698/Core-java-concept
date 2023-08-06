package core.java.classes;

public class ArrayWithDiffDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[6];
		a[0] = 25;
//		a[1] = "Hello";
//		a[2] = 45.789;
//		a[3] = true;
		a[4] = 100;
		a[5] = 101;
		
		for(int i: a) {
			System.out.println(i);
		}
		
		System.out.println("The size of an array is: " +a.length);
		
//		a.remove(25);
	}

}
