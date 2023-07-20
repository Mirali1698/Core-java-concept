package core.java.classes;

public class AggregationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student mirali = new Student("Mirali", 23);
		Student abc = new Student("abc", 24);
		StandardClass standard = new StandardClass("Mahesh", 8, mirali);
		StandardClass s2 = new StandardClass("Mahesh", 8, abc);

		standard.printValue();
	}

}
