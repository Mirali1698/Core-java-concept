package core.java.wrapper;

public class DemoWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 25;
		Integer b = a;
		System.out.println("Performing autoboxing: " + b);
		Integer c = Integer.valueOf(a);
		System.out.println("Performing explict boxing: " + c);
		// unboxing
		Integer e = new Integer(20);
		System.out.println("Value of e is: " +e);
		int f = e;
		System.out.println("performing auto unboxing: " + f);
		int g = e.intValue();
		System.out.println("Performing explict unboxing: " + g);
	}

}
