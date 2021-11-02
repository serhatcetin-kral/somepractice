package javapractice;

import java.util.Scanner;

public class FirstLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that gives the sum of the first and last digits of the
 *  3-digit number entered by the user.
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a 3 digit number");
		int i = scan.nextInt();
		
		int first = i/100;
		int last = i%10;
		
		System.out.println(first+last);
		
		scan.close();
		
	}

}
