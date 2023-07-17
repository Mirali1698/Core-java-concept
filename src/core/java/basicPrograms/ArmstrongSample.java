package core.java.basicPrograms;

public class ArmstrongSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 999, armStrong, temp, rem, power, powerValue;

		// Execute loop for num-times to get armstrong value till num
		for (int i = 1; i <= num; i++) {
			
			
			//start the logic to check if the number is Armstrong or not
			//Assign values
			//sum is to sum of every individual digit's powervalue 
			//ex. for three digit number 123
			//sum = 1^3 + 2^3 +3^3
			armStrong = 0;
			power = 0;
			temp = i;

			//to get the digits of a number
			while (temp > 0) {
				
				//set temp value to get the digits of number and increment the power variable
				temp = temp / 10;
				power++;
			}
			
			//set temp value again to the i value
			temp = i;
			while (temp > 0) {
				
				//to get the last digit of number
				rem = temp % 10;
				
				//power value is the power of rem
				//ex. for 123 first round powerValue is 3^3=27
				//and second round 2^3 = 8
				powerValue = 1;
				
				//logic to find the power of every digit
				for (int j = 1; j <= power; j++) {
					powerValue = powerValue * rem;
				}
				
				//set sum as an armstrong value
				armStrong = armStrong + powerValue;
				temp = temp / 10;

			}
			//end of logic to check if the number is armstrong or not
			
			//if  armstrong value and i both equal then the value is armstrong value
			if (armStrong == i) {
				System.out.println(i + " ");
			}

		}

		// logic- power of number
//		int num =5, power=3, sum=1;
//		
//		for(int i=1; i<=power; i++) {
//			sum = sum*num;
//		}
//		System.out.println(sum);
	}

}
