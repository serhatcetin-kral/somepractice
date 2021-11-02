package javapractice;

import java.util.Scanner;

public class Square_Perimeter_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * ask the user about one side of the square
		 * find the area and perimeter of the square
		 * print on the console
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter te side of square ");
		int a=scan.nextInt();
		int area=a*a;
		int perimeter=4*a;
		System.out.println("perimeter of square="+perimeter+" area of square="+area);		
		
	}

}
