package javapractice;

import java.util.Scanner;

public class SleepTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Ask the user how many hours he slept in a day, 
		 * print out how many days he slept in a month, a year and 40 years
		 */
		
		  Scanner scan = new Scanner(System.in);

	        System.out.println("Günlük uyku saatinizi giriniz..");
	        double u = scan.nextDouble();

	        System.out.println("Ayda " + u*30/24 + ", yilda " + u*365/24 + ", 40 yilda " + u*365*40/24 + " gununuz uykuda geciyor..");
	        scan.close();
		
	}

}
