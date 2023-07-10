package core.java.operatrs;

public class BitwiseOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5; //0101
		int b = 2; //0010
		// Bitwise And will perform on the binary value,
		//if both bits are true then only the result will be true
		int c = a&b;
		System.out.println(c);
		//bitwise Or is false when both are false otherwise true
		int d = a|b;
		System.out.println(d);
		
		//bitwise compliment(~) will convert 0 into 1 and 1 into 0
		int e = ~a;
		System.out.println(e);
	}

}
