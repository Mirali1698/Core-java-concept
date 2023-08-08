package core.java.classes;

//parent class
public class FatherInheritance {

	String hair = "black";
	String eye = "black";

	public void speaking() {
		System.out.println("Father is Speaking from father class");
	}
}

//Simple inheritance
//Son is child class of FatherInheritance
class Son extends FatherInheritance {

	int standard = 5;
	String schoolName = "ABC international";

	public void study() {
		
		System.out.println("Son is studying in Standard " + standard);
	}
}


//Multi-level Inheritance
//GrandSon is child class of Son Class
class GrandSon extends Son {

	public void studyInCollege() {

		System.out.println("Grandson is studying in Lambton college");
	}
}

//Hierarchical Inheritance
//Daughter is the child class of fatherInheritance

class Daughter extends FatherInheritance{
	
	int standard = 10;
	public void study() {
		System.out.println("Daughter is studying in standard: "+standard);
	}
}