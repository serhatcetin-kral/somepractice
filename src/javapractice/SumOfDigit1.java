package javapractice;

import java.util.Scanner;

public class SumOfDigit1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Write a program that gives the sum of the digits of the 4-digit number entered by the user.

	*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 4 basamakli bir sayi giriniz");
		int i = scan.nextInt();
		
		int binlerBasamagi = i/1000;
		int yuzlerBasamagi = (i/100)%10;
		int onlarBasamagi = (i%100)/10;
		int birlerBasamagi = i%10;
		
		System.out.println(binlerBasamagi+yuzlerBasamagi+onlarBasamagi+birlerBasamagi);
		
		scan.close();
	
	}

}
