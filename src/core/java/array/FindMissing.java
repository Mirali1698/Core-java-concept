package core.java.array;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] {1,2,3,6,7,8, 4,5, 9,12,13,17};
		int counter = a[0];
		int index = 0;
		int last = a[a.length-1];
		do {
			if(a[index]!= counter) {
				System.out.println("Missing value is:" +counter);
			}
			else {
				index++;
			}
			counter++;
		}while(counter!=last);
		
	}

}
