package core.java.classes;

import java.util.*;

public class ListOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// create object of Student class

		List<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(new Student("ABC", 28));
		listOfStudent.add(new Student("DEF", 29));
		listOfStudent.add(new Student("GHI", 27));
		listOfStudent.add(new Student("JKL", 30));
		listOfStudent.add(new Student("MNO", 25));

		System.out.println("Print object value using iterator");
		Iterator<Student> it = listOfStudent.iterator();
		while (it.hasNext()) {
			System.out.println("Student name is: " + it.next().getStudentName());
//			System.out.println("Student rollnumber is: " + it.next().getStudentRollNumber());
		}

		System.out.println("Print object value using for loop");
		//print using for loop
		for (int i = 0; i < listOfStudent.size(); i++) {
			System.out.println("Student name is: " + listOfStudent.get(i).getStudentName());
			System.out.println("Student Rollnumber is: " + listOfStudent.get(i).getStudentRollNumber());

		}
		
		System.out.println("Print object value using enhanced for loop");
		//print using enhanced for loop
		for (Student i : listOfStudent) {
			System.out.println("Student name is: " +i.getStudentName());
			System.out.println("Student rollnumber is: " +i.getStudentRollNumber());
		}
	}

}
