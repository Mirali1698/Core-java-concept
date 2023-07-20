package core.java.classes;

public class StandardClass {

	String classTeacher;
	int standard;
	Student student;

	public StandardClass(String classTeacher, int standard, Student student) {
		super();
		this.classTeacher = classTeacher;
		this.standard = standard;
		this.student = student;
	}

	public String getClassTeacher() {
		return classTeacher;
	}

	public void setClassTeacher(String classTeacher) {
		this.classTeacher = classTeacher;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void printValue() {
		System.out.println(classTeacher);
		System.out.println(standard);
		System.out.println("Student RollNumber is: " +student.getStudentRollNumber());
		System.out.println("Student Name is: " +student.getStudentName());
		System.out.println("Student Marks is: " +student.getMarks());
		System.out.println("Student myname is: " +student.getMyName());
	}

}
