package core.java.numberProgram;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0; i<=100; i++) {
			if(numIsSunny(i+1))
				System.out.print(i+" ");
		}
	}

	private static boolean numIsSunny(int i) {
		// TODO Auto-generated method stub
		
		double sqrt = Math.sqrt(i);
		
		double floorValue = sqrt - Math.floor(sqrt);
		
		if(floorValue == 0)
			return true;
		else
			return false;
	}

}
