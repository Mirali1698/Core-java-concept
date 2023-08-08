package core.java.keyWords;

public class DemoStatic {

//	main method is static so we do not need to create the object of the class to call the main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object and call parameterized constructor with two arguments
		Student obj1 = new Student("Mirali", 23);
		System.out.println();

//		create object and call parameterized constructor with two arguments but in different order
//		error will occur bcz the argument should be in the same order as parameter passed in the constructor
//		Student obj3 = new Student(25, "Rahul");

		// call the default constructor
		Student obj4 = new Student();

		// assign the value to the instance variables of Student class
		obj4.studentName = "Rahul";
		obj4.studentRollNumber = 25;
	
		// call non-static method of the student class
		obj1.studentReading();
		System.out.println();

		// call the static method of the student class
		obj1.studentWriting();
		System.out.println();

		// to call static method do not need to create the object
		// the method can called directly using the class name
		Student.studentWriting();
		System.out.println();

		// Reading method is non-static which cannot be called using class name
//		Student.studentReading();

		// call the constructor with three parameter
		Student obj6 = new Student("Vijay", 26, 89);
		System.out.println();

		System.out.println("Marks of vijay: " + Student.marks);
		System.out.println();

		obj6.studentReading();
		System.out.println();

		// call static method within the same class
		helloWorld();

		// local variable within main method
		String myName = "ABC";

	}

	//

//	public void helloWorld() {
	public static void helloWorld() {
		System.out.println("Hello World!");
	}

}

class Student {

	// instance variable defined within the class
	String studentName;
	int studentRollNumber;
	String myName = "XYZ";

	// static variable can accessed directly without creating object
	// static variable can be used in any method
	static int marks;

	// create non-static method for print
	public void printData() {

		// yourName is local variable and the scope is within this PrintData method
		// only
		String yourName = "123";

		// myName is instance variable so can be used in any method within the same class
		System.out.println("My name is from printData: " + myName);

		System.out.println("Your Name is from PrintData: " + yourName);
	}

	// default constructor needs to create when we create any other constructor with
	// parameters
	public Student() {

	}

	// create two parameterized constructor
	public Student(String studentName, int studentRollNumber) {

		// initialized the value to the instance variable
		// instance variable = local variable
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.marks = 80;

		// instance variable can be used in any method within the same class
		System.out.println("My name is from two parameterized constructor: " + myName);

		// local variable cannot be used outside of its scope
//		System.out.println("Your Name is from two parameterized constructor: " +yourName);

		System.out.println("Marks is from the two parameterized constructor: " + marks);
	}

	// create constructor with three parameters
	public Student(String studentName, int studentRollNumber, int marks) {
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.marks = marks;
	}

	// create non-static method which need to call using object
	public void studentReading() {
		System.out.println("Student is reading");

		// static variable can be used in non-static method but vice versa is not possible
		System.out.println("Marks is from reading: " + marks);

		// non-static variable can be used in non-static method
		System.out.println("Student name is from Reading: " + studentName);
		System.out.println("Student roll number is from Reading: " + studentRollNumber);
	}

	// static block which will execute first even before main method
	static {
		marks = 95;
		System.out.println("Marks is from static block: " + marks);
	}

	// create static method which can be called directly using class name
	// inside static everything should be static

	public static void studentWriting() {
		System.out.println("Student is writing");

		// static variable can be used in any method
		System.out.println("Marks is from StudentWriting: " + marks);

		// non-static variable cannot be used inside static method
//		System.out.println("Student name is: " + studentName);
//		System.out.println("Student roll number is: " + studentRollNumber);
	}
}