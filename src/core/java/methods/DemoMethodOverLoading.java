package core.java.methods;

public class DemoMethodOverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Method overloading - within same class methods define with same name with different signature
		Calculation calculation = new Calculation();
		int a = 5;
		int b = 8;
		int c = 9;
		int d;
		int e;
		
		//calling the method with two parameters
		d = calculation.addition(a, b);
		System.out.println(d);
		
		//calling method with three parameters
		e = calculation.addition(a, b, c);
		System.out.println(e);

	}

}

class Calculation {

	int a;
	int b;
	int c;

	public Calculation() {

	}

	public Calculation(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	//define method with two parameters
	public int addition(int a, int b) {

		System.out.println("Addition of two parameters");
		return a + b;
	}
	
	//define method with three parameters
	public int addition(int a, int b, int c) {
		System.out.println("Addition of three parameters");
		return a + b + c;
	}

	//abstract method should be in abstract class
//	public abstract int addition(int a, int b, int c);

//	public abstract void addition();

}