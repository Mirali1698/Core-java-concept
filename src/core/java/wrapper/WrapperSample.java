package core.java.wrapper;

public class WrapperSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Custom a = new Custom(5);
		System.out.println("The value of a is: " +a);
		
	}

}

class Custom{
	int i;
	
	public Custom() {
		
	}
	
	public Custom(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String toString() {
		return Integer.toString(i);
	}
}