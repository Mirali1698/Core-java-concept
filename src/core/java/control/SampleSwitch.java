package core.java.control;

public class SampleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'b';
		switch (c) {
		case 'a': 
			System.out.println("This is case a");
		case 'A':
			System.out.println("This is case A");
			//break is used to break the case block
			break;
			//if break is not used it will continue with the next case considering the same case block code
		case 'b': 
			System.out.println("This is case B");
		case 'c': 
			System.out.println("This is case C");
		default: 
			System.out.println("This is default C");
		}
	}

}
