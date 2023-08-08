package core.java.strings;

public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//StringBuffer is used for performance enhancement
		//In stringBuffer when we change the value of a string it will not create another reference
		//StringBuffer is mutable
		
		//StringBuffer cannot create like string bcz it is class and need to create object
//		StringBuffer sb = "ABC";
		StringBuffer sb = new StringBuffer("ABC");
		System.out.println("The address is: " +sb.hashCode());
//		sb= sb+ "DEF";
		//Append() is used to modify the value and add another string at the end
		sb = sb.append("DEF");
		System.out.println(sb);
		//After modify the value of stringBuffer the memory location remain same
		System.out.println("The address after modify : " +sb.hashCode());
		
	}

}
