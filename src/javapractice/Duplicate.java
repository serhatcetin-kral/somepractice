package javapractice;

import java.util.Random;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int number = scan.nextInt();
		Random random = new Random();
		int randomNumber = random.nextInt(number);
		System.out.println(number);
		System.out.println(randomNumber);
        int a = 0;
        int sum = 0;
		while(randomNumber>0) {
			a=randomNumber%10;
			sum = sum + a;
			randomNumber=randomNumber/10;
		}
		System.out.println("The sum of digits of given integer is: "+sum);
		scan.close();

		
		
	}

}
