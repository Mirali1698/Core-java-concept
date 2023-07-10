package core.java.array;

public class SampleMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 declare 2D array
//		int[][] arr1;
//		arr1 = new int[3][3];     //define the size of the array
//		assign the value to the array which gives error
//		bcz the array value can be assign only as an intializer
//		arr1 ={ { 2, 3, 7, 5 }, { 4, 5, 6, 8 }, { 1, 2, 3, 9 } };    

//		declare 2D array as array literal

		int[][] arr1 = new int[][] { { 2, 3, 7, 5 }, { 4, 5, 6, 8 }, { 1, 2, 3, 9 } };

		// print the 2D array using for loop
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Declare another array ");

//		gives runtime error bcz at the first index it takes the size of the array as 3
//		and at second index the size is 4 which out of bound
		int[][] arr2 = new int[][] { { 2, 3, 7 }, { 4, 5, 6, 8 }, { 1, 2, 3, 9 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}

}
