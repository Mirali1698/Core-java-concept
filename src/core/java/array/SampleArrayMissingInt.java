package core.java.array;

public class SampleArrayMissingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize an array
		int[] arr = new int[] {1, 2, 6, 7, 11, 12};
		
		//assign temp value as 1
		int missValue = 1;
		
		//print an array
		System.out.println("The array is: ");
		for(int i: arr)
			System.out.print(i +" ");
		System.out.println();
		
		//logic to check for missing value in sequence
		//for loop to go through each index from 0 to n-1
		for(int i = 0;i<arr.length; i++) {
			
			//to check if value at index i is equal to temporary counter and increment the counter by one
			if(arr[i] != missValue) {
				System.out.println("The missing value is: " +missValue);
				i--;	
			}
			missValue++;
		}
	}

}
