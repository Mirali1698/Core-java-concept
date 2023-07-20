package core.java.basicPrograms;

public class AsciiValuePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 65; i<=90; i++) {
			System.out.println("The char at " +i +" is " +(char)i);
		}
		
		
		char ch = 'N';
		for(char i = 'a'; i<='z'; i++) {
			System.out.println("Ascii value of " +i + " is " +(int)i);
		}
		System.out.println("ASCII value of " +ch + " is " +(int)ch);
	}

}
