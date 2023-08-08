package core.java.strings;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create string as a literal
		String s1 = "ABC";

		// create string as an object
		String s2 = new String("abc");
		String s3 = "ABC";

		System.out.println("String using literal: " + s1);
		System.out.println("String using object: " + s2);

		// both are not equal bcz the refrence(memory address) is different
		System.out.println("It is equal: " + (s1 == s2));

		// Using equals method it is checking every character(value)
		System.out.println("Compare string using equal method: " + s1.equals(s2));
		// equalIgnoreCase will ignore the case
		System.out.println("Compare string using equalIgnorCase method: " + s1.equalsIgnoreCase(s2));

		// == checks for the refernce in string constant pool
		System.out.println("Is that equal: " + (s1 == s3));
		System.out.println("Address of s1: " + s1.hashCode());

		// String is unmutable- everytime we change the value of a string it will create
		// new reference(memory location)
		// and old reference stays there
		s1 = s1 + "DEF";
		System.out.println("Is that mutable? " + s1);
		System.out.println("Address of s1: " + s1.hashCode());
		System.out.println("S3 is: " + s3);

		s2 = s2 + "DEF";
		System.out.println("Is that mutable? " + s2);
		System.out.println("The length of s1: " + s1.length());

	}

}
