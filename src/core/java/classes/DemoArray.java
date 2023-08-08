package core.java.classes;

public class DemoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1[] = new Student[5];
		s1[0] = new Student("ABC", 23);
		s1[1] = new Student("XYX", 25);
		s1[2] = new Student("JKL", 26);
		s1[3] = new Student("MNO", 27);
		s1[4] = new Student("DEF", 28);
		
		for(Student s:s1) {
			System.out.println(s.studentName);
			System.out.println(s.studentRollNumber);
		}
	}

}
