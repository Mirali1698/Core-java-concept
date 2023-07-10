package core.java.prac;

public class Lec02_Sample8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//8. What is the syntax of variables ?
			//Ans. The syntax of variables is 
				//datatype variable_name = value;
				int a= 5;
				System.out.println("The variable is " +a);
		//9. Can we change the value and data type of a variable,
				//once we declared and assigned some value ? 
				//if your answer is yes OR not explain why ?
				//Ans. We can change the value of the variable until and unless it was not constant,
				//	but we cannot change the data type of a variable.
				// we can initialize the value for only one time, but we can assign the value for multiple times.
				//if we initialize the duplicate variable the compiler get confused
				// that which type of data variable we are referring so, it will get compilation error
				//double a = 10;
				a = a+50;
				System.out.println(" The value is: " +a);

	}

}
