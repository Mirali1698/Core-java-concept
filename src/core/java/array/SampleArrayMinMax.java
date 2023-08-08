package core.java.array;

public class SampleArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize an array
		int[] arr = new int[] {5, 7, 9, 6, 4, 3, 11, 100, 0, -9, 45};
		
		//to store the min and max value of array
		int max= 0, min = 0;
		
		//print the array
		System.out.println("The array is: ");
		for(int i: arr) {
			System.out.println(i +" ");
		}
		
		//logic to find min and max value from an array
		//for loop to go through each index of array from 0 to n-1
		for(int i = 0; i<arr.length; i++) {
			
			//if value at index i more than max then store value of i as max value
			if(max<arr[i]) {
				max = arr[i];
			}
			
			//if value at index i less than min then store value of i as min value
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("The maximum value of array is: " +max);
		System.out.println("The minimum value of array is: " +min);
	}

}
