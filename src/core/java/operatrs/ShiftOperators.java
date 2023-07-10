package core.java.operatrs;

public class ShiftOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;	//5 =00101
		//left shift add zero's in the end
		int b = a<<2;  //b = 10100
		System.out.println(b);
		
		// right shift will end zero's at the start and cut the value's from the end.
		int c = b>>2; //c = 00101
		System.out.println(c);
	}

}
