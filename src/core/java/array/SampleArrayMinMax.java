package core.java.array;

public class SampleArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] {5, 7, 9, 6, 4, 3, 11, 100, 0, -9, 45};
		int max= 0, min = 0;
		
		System.out.println("The array is: ");
		for(int i: arr) {
			System.out.println(i +" ");
		}
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("The maximum value of array is: " +max);
		System.out.println("The minimum value of array is: " +min);
	}

}
