package core.java.array;

public class SampleReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//initialize an array
		int[] arr = new int[] {4, 5, 6, 7, 8, 9, 1, 2, 3};
//		int[] rev = new int[9];
		
//		int j=0;
		//print the array
		System.out.println("The original array is: ");
		for(int i: arr)
			System.out.print(i +" ");
		System.out.println();
		
		
		//logic to print the reversed array
		System.out.println("The reversed array is: ");
		
		//for loop starting from last index(length-1) to 0 to go through each index
		for(int i = arr.length-1; i>=0; i--) {
			//print the last index first
			System.out.print(arr[i] +" ");
			
			//Another option to store reversed array in rev
//				rev[j] = arr[i];
//				j++;
		}
		
		
		//to print if the reversed array is stored in rev
//		for(int i: rev) {
//			System.out.println(i);
//		}
	}

}
