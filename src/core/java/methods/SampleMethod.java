package core.java.methods;

public class SampleMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printData();
		String s = getString();
		System.out.println(s);
		int a = 10;
		printTwoVariableData(s,a);
	}

	public static void printData() {
		System.out.println("Printing from printData Method");
	}
	
	public static String getString() {
		String s = "";
		s = "Printing from return type getString Method";
		return s;
	}
	
	public static void printTwoVariableData(String s, int a) {
		System.out.println(s);
		System.out.println(a);
	}

}
