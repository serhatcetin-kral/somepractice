package javapractice;

import java.util.Scanner;

public class FloatToShort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Ask the user to enter a float value, 
		 * convert that number to short variable type and print it in the console.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir float deger giriniz");
		float f = scan.nextFloat();
		
		short s = (short) f;
		System.out.println(s);
		
		scan.close();
		
	}

}
