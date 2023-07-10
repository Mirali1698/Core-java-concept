package core.java.classes;

public class DemoClass {

	int i;
	String s;
	boolean b;
	int j;

	public void PrintData() {
		System.out.println("Hello World from Demo class");
	}

	public int addTwoInt(int i, int j) {
		int k = i + j;
		return k;
	}

//	DemoClass d1 = new DemoClass();

	public DemoClass(int i, String s, boolean b, int j, DemoClass d1) {
		this.i = i;
		this.s = s;
		this.b = b;
		this.j = j;
//		this.d1 = d1;
	}

	public DemoClass(int x, int y) {
		this.i = x;
		this.j = y;
	}
	
	public void printValue() {
		System.out.println(this.i);
		System.out.println(this.j);
		System.out.println(this.s);
	}
	public DemoClass() {
		// TODO Auto-generated constructor stub
		this.i = 2;
		this.j = 3;
		this.s = "Hello";
		this.b = false;
		System.out.println("Int"+ i + "Int" +j +"String" + s + "Boolean " + b);
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

}
