package core.java.array;

public class SampleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr; // declare an array
		arr = new int[5]; // allocating memory
		System.out.println(arr.hashCode()); // print the memory location of array

		// Assign the value to the array

		arr[0] = 5;
		arr[1] = 6;
		arr[2] = 7;
		arr[3] = 8;
		arr[4] = 9;
//		arr[5] = 10;
//		arr[6] = 11;

		// System.out.println(arr[5]); will show the error because the length of the
		// array is 5
		// so, we can not store more than 5 values

		System.out.println("The length of array is: " + arr.length); // prints the length of the array

		// print array using for loop
		System.out.println("Print array through for loop");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// print the array using enhanced for loop
		System.out.println("Print array using enhanced for loop");

		for (int i : arr) {
			System.out.println(i);
		}

		System.out.println("Define array using array literal");

		// to define array literal we do not need to define the size of the array
		int b[] = new int[] { 21, 22, 23 };
		System.out.println("Print array using for each loop");
		for (int i : b) {
			System.out.println(i); //print array
		}
	}

}
