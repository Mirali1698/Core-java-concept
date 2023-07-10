package core.java.control;

public class Lec04_Sample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 7;
		switch (day) {

		case 1:
			System.out.println("It is Monday");
			break;

		case 2:
			System.out.println("It is Tuesday");
			break;

		case 3:
			System.out.println("It is Wednesday");
			break;

		case 4:
			System.out.println("It is Thursday");
			break;

		case 5:
			System.out.println("It is Friday");
			break;

		case 6:
			System.out.println("It is Saturday");
			break;

		default:
			System.out.println("It is Sunday");
			break;
		}

		char vowel = 'A';
		switch (vowel) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("It is vowel:" + vowel);
			break;

		default:
			System.out.println(vowel + " is not vowel");
			break;
		}

	}

}
