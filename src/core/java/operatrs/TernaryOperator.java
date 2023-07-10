package core.java.operatrs;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find maximum value
		int a = 10;
		int b = 5;
		if(a>b)
			 System.out.println("A is maximum " +a);
		else
			System.out.println("B is maximum " +b);
		// ternary operator will store a if condition is true otherwise store b
		int c= (a>b)?a:b;
		System.out.println("Maximum is:" +c);
	}

}
