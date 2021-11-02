package javapractice;

import java.util.Scanner;

public class Digits {
	
	
	/*
	Get  three digits number from the user and print the digits of the numbers as ones, tens and hundreds digits


	Inputs : 853
		         * Output : The ones digit of the number you entered: 3
		         *          The tens digit of the number you entered: 5
		         *          The hundreds place of the number you entered is : 8


	*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan= new Scanner (System.in);
        System.out.println("Enter a 3 digit number" );
        int number =scan.nextInt();


        // 1) find ones digit

        int ones= number%10;
        System.out.println("The ones digit of the number you entered " + ones);
        number/=10;

        // 2) find tens digit 

        int tens= number%10;
        System.out.println("girdiginiz sayinin onlar basamagi " + tens);

        // 3) find hundreads digits
        int hundreds=number/=10;
        System.out.println("girdiginiz sayinin yuzler basamagi " + hundreds);

        scan.close();
	}

}
