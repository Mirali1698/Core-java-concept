package core.java.array;

public class SampleArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {8,5,9,0,2,7,6,4,3};
		int swap;
		
		//print the original numeric array
		System.out.println("Original array is:");
		for (int i : arr) {
			System.out.print(i +" ");
		}
		
		System.out.println();
		//use of two for loops 
		//outer for loop: to compare one index value with every j value of array
		for (int i = 0; i < arr.length; i++) {
			
			//inner loop: to compare and increment j
			for (int j = i + 1; j < arr.length; j++) {
				
				//swap the i and j index value
				if (arr[i] > arr[j]) {
					swap = arr[j];
					arr[j] = arr[i];
					arr[i] = swap;
				}
			}

		}
		
		//print the array using for each
		System.out.println("The sorted numeric array is: ");
		for (int i : arr) {
			System.out.print(i+ " ");
		}
	
	}

}
