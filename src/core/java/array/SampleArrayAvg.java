package core.java.array;

public class SampleArrayAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialization of an array
		int[] a = new int[] {1,2,3,-8,10,45};
		double sum = 0;
		//sum of the each elements of array
		for(int i = 0; i< a.length; i++) {
			sum = sum + a[i];
		}
		//calculate the average of sum
		double avg = sum / a.length;
		System.out.println("The average of the array is: " +avg);
	}

}
