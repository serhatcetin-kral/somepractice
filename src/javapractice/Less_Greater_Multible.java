package javapractice;

import java.util.Scanner;

public class Less_Greater_Multible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ask the user to enter a number and multiply the number 
		 * by one smaller and one greater than the number itself
		 */
		
	
		Scanner scan = new Scanner(System.in);

        System.out.println("Bir tam sayi giriniz... ");

        int sayi = scan.nextInt();


        System.out.println((sayi+1)*(sayi)*(sayi-1)+" ("+ (sayi-1)+ "*"+sayi+"*"+(sayi+1)+")");


        scan.close();
	}

}
