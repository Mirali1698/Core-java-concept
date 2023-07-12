package core.java.array;

public class SampleArrayEqualityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[] { 2, 3, 5, 7, 11 };
		int[] arr2 = new int[] { 2, 3, 5, 7, 11};
		
		//print both arrays
		System.out.println("The first array is: ");
		for(int i: arr1)
			System.out.print(i+ " ");
		
		System.out.println("\nThe second array is: ");
		for(int i: arr2)
			System.out.print(i+ " ");

		System.out.println();
		
		// define boolean value to set the flag true when strings are equal
		boolean flag = true;

		//if both array has same size will check for loop
		if (arr1.length == arr2.length) {
			for (int i = 0; i < arr1.length; i++) {
				//to check the value at each index 
				//if both values are not same set flag false and break for loop
				if (arr1[i] != arr2[i]) {
					flag = false;
					break;
				}
			}
		} 
		
		// if size is different arrays are not equal
		else {
			flag = false;
		}

		//if flag is true arrays are equal otherwise not equal
		if (flag == true) {
			System.out.println("The arrays are equal");
		} else {
			System.out.println("The arrays are not equal");
		}
	}

}
