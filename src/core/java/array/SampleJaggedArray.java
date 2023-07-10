package core.java.array;

public class SampleJaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// jagged array
		// array of array

		// the jagged array's length is 2
		int[][] arr = new int[2][];

		System.out.println("The length of array is:" + arr.length);

//		 At the first index of jagged array the new array of size 3 is defined

		arr[0] = new int[3];

//		 At the second index of jagged array the array of size 2 is defined
		arr[1] = new int[2];

		System.out.println("The length of array is:" + arr.length);

//		 to assign the value to the jagged array
		int count = 1;

//		 outer loop for arr- jagged array of size 2
		for (int i = 0; i < arr.length; i++) {

//			 inner loop to assign value to the both array of Jagged array
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;

			}
		}

//		 print the array value using for each loop

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
