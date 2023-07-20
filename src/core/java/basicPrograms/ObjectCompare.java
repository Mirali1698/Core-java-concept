package core.java.basicPrograms;

public class ObjectCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating object of class
		A obj1 = new A(12, "Mira");
		A obj2 = new A(13, "Mirali");
		A obj3 = new A(12, "Mira");
		
		
		
		if(obj1.equals(obj3))
			System.out.println("Obj1 and obj3 are equal");
		else
			System.out.println("obj1 and obj3 are not equal");
		
		if(obj1.equals(obj2))
			System.out.println("obj1 and obj2 are equal");
		else
			System.out.println("obj1 and obj2 are not equal");
		
		A obj4 = new A();
		obj4 = obj1;
	
		if(obj1.equals(obj4))
			System.out.println("obj1 and obj4 Both are equal");

		System.out.println("Hashcode of obj1: " +obj1.hashCode());
		System.out.println("Hashcode of obj4:" +obj4.hashCode());
		

	}

}
class A{
	int id;
	String name;
	
	public A(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public A() {
		// TODO Auto-generated constructor stub
	}
}