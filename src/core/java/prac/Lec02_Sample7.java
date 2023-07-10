package core.java.prac;

public class Lec02_Sample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//What is the difference between “=” and “==”.
		// '=' is used to assign the value and '==' is used to compare two values.
		int a=5;
		int b = 10;
		int c = 5;
		if (a==b)
			System.out.println("The value a & b is equal");
		else
			System.out.println("The value a & b is different");
		
		if(a==c)
			System.out.println("The value a & c is equal");
		else
			System.out.println("The value a & c is different");
	}

}
