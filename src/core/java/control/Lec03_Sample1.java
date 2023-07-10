package core.java.control;

public class Lec03_Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   1. Perform left & right shift operation
		System.out.println("Left shift 80 by 4 is: " +(80<<4));
		
		System.out.println("Right shift 80 by 4 is: " +(80>>4));
//   2. program to find minimum and maximum number
		int a = 10;
		int b = 20;
		int c = 30;
		//program to find maximum number
		if(a>=b) {
			if(a>=c) {
				System.out.println("Between 10, 20 and 30 maximum is a: " +a);
				//System.out.println("Between 10, 20 and 30 minimum is a: " +a);
			}
			else {
				System.out.println("Between 10, 20 and 30 maximum is c: "+c);
			}
		}
		else {
			if(b>=c) {
				System.out.println("Between 10, 20 and 30 maximum is b: " +b);
			}
			else {
				System.out.println("Between 10, 20 and 30 maximum is c: " +c);
			}
		}
		//program to find minimum number
		
		if(a<=b) {
			if(a<=c) {
				System.out.println("Between 10, 20 and 30 minimum is a: " +a);
			}
			else {
				System.out.println("Between 10, 20 and 30 minimum is c: " +c);
			}
		}
		else{
			if(b<=c) {
				System.out.println("Between 10, 20 and 30 minimum is b: " +b);
			}
			else {
				System.out.println("Between 10, 20 and 30 minimum is c: " +c);
			}
		}
		
//   3. Bitwise AND and OR operation
		
		System.out.println("Bitwise And 5&7 is: " +(5&7));
		
		System.out.println("Bitwise OR 5|7 is: " +(5|7));
		
//   4. minimum and maximum number using ternary operator
		
		int i = 22;
		int j = 25;
		//find maximum number
		int k = (i>=j)?i:j;
		System.out.println("Maximum number from 22 and 25 is: " +k);
		k = (i<=j)?i:j;
		System.out.println("Minimum number from 22 and 25 is: " +k);
		
//   5. minimum and maximum number using logical conditional operator
		//maximum number
		if(a>=b && a>=c) {
			System.out.println("Maximum number is a: " +a);
		}
		else if(b>=a && b>=c) {
			System.out.println("Maximum number is b: " +b);
		}
		else
			System.out.println("Maximum number is c: " +c);
		
		//minimum number
		
		if(a<=b && a<=c) {
			System.out.println("Minimum number is a: " +a);
		}
		else if(b<=a && b<=c) {
			System.out.println("Minimum number is b: " +b);
		}
		else
			System.out.println("Minimum number is c: " +c);
		
//   6. if to find string matching or not
		
		String day = "Mon";
		
		if(day == "mon") {
			System.out.println("String is matched.");
		}
		System.out.println("Program is working");
		
//   7. use of if else control statement
		
		int raj = 4;
		int rahul = 28;
		int jay = 18;
		int nisha = 23;
		int devang = 64;
		
		agedefine(raj);
		agedefine(rahul);
		agedefine(jay);
		agedefine(nisha);
		agedefine(devang);
		
	}

	public static void agedefine(int age) {
		if(age>0 && age< 5) {
			System.out.println("Child group age in given record is: " +age);
		}
		else if(age>= 5 &&  age<=17 ) {
			System.out.println("Adolescents group age in given record is: " +age);
		}
		else if(age>=18 && age<=30) {
			System.out.println("Adult group age in given record is: " +age);
		}
		else if(age>30) {
			System.out.println("Adults older group age in given record is: " +age);
		}
	}
}
