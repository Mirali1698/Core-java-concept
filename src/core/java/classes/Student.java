package core.java.classes;

public class Student {

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
//			System.out.println("Your Name is from two parameterized constructor: " +yourName);

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

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public int getStudentRollNumber() {
			return studentRollNumber;
		}

		public void setStudentRollNumber(int studentRollNumber) {
			this.studentRollNumber = studentRollNumber;
		}

		public String getMyName() {
			return myName;
		}

		public void setMyName(String myName) {
			this.myName = myName;
		}

		public static int getMarks() {
			return marks;
		}

		public static void setMarks(int marks) {
			Student.marks = marks;
		}

		public static void studentWriting() {
			System.out.println("Student is writing");

			// static variable can be used in any method
			System.out.println("Marks is from StudentWriting: " + marks);

			// non-static variable cannot be used inside static method
//			System.out.println("Student name is: " + studentName);
//			System.out.println("Student roll number is: " + studentRollNumber);
		}

}
