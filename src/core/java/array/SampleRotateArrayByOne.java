package core.java.array;

public class SampleRotateArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize an array
		int[] arr = new int[] { 4, 5, 6, 1, 2, 3 };
		
		//define temporary variable
		int swap;
		
		//print the array
		System.out.println("The array is: ");
		for (int i : arr)
			System.out.print(i + " ");

		System.out.println();

		//To rotate array value to the right by one index
		
		//Assign the value of last index to temporary variable
		swap = arr[arr.length-1];
		
		//decrement for loop
		//assign a[0] value to the a[1]
		for (int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		
		//assign temporary value to the first index
		arr[0] = swap;
		
		//End of logic for rotate array right by one
		
		//print the array
		System.out.println("Rotated array is: ");
		for(int i: arr)
			System.out.print(i +" ");
	}

}
