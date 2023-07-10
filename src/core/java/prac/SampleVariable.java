package core.java.prac;

public class SampleVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define variables
		//initialize and assign boolean variable which is true or false value
		boolean b = false;
		//initialize and assign char variable from a-z, A-Z
		char c = 'B';
		//initialize and assign 32-bit integer variable stores whole number
		int i= 5;
		// final to make the constant variable
		//final int i = 5;
		//initialize and assign 8- bit byte variable from -128 to 127
		byte a = 7;
		//initialize and assign 16-bits short integer variable
		short s = 50;
		//initialize and assign 64-bit long integer variable
		long l = 10000;
		//initialize and assign float variable stores with decimal numbers
		float f = 3.75f;
		//initialize and assign 64-bit double precision floating variable
		double d = 3.12345678;

		System.out.println("Boolean is: " + b);
		System.out.println("char is: " + c);
		System.out.println("int is before: " + i);
		System.out.println("byte is: " + a);
		System.out.println("short is: " + s);
		System.out.println("long is: " + l);
		System.out.println("float is:" + f);
		System.out.println("Double is: " + d);
		//cannot be changed because of final 
		i = 20;
		System.out.println("int is after: "+i);
	}

}
