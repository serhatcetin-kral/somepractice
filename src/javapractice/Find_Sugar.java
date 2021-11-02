package javapractice;

import java.util.Scanner;

public class Find_Sugar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 
		 * ask to user  how many cups of tea you drink daily and how many spoons of sugar
		 * one spoon sugar is 1.7 gr
		 * print on the console amount of sugar used annually
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter how many cups of tea you drink daily.");
		int cupsOfTea=scan.nextInt();
		
		System.out.println("how many spoons of sugar");
		int sugar=scan.nextInt();
		System.out.println("amount of sugar used annually ="+(365*cupsOfTea*sugar*1.7/1000));
	}

}
