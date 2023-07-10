package core.java.classes;

public class TestingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoClass dc1 = new DemoClass();
		int x = 20;
		int y = 15;
		int a = dc1.addTwoInt(x, y);
		System.out.println(a);
		
		dc1.i = 25;
		dc1.j = 50;
		dc1.b = true;
		dc1.s = "Hi";
//		a = dc1.addTwoInt(dc1.i, dc1.j);
//		System.out.println(a);
		Demo d = new Demo();
		d.printData();
	
		DemoClass dc2 = new DemoClass(x, y);
		dc2.printValue();
		
		DemoClass dc3 = new DemoClass();
		dc3.setI(22);
		dc3.setJ(42);
		dc3.setS("Listen");
		dc3.printValue();
	
	}

}

class Demo{
	
	public void printData() {
		System.out.println("From Demo class");
	}
	
}

