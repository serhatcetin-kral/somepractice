package javapractice;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ask the user for an edge and height of an equilateral triangle
		 * find the area and perimeter of the triangle
		 * print on the console
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunlugunu giriniz");
        int edge=scan.nextInt();
        System.out.println("Lutfen ucgenin yuksekligini giriniz");
        int height=scan.nextInt();
        System.out.println("Alan: "+ edge*height/2);
        System.out.println("Cevre: "+3*edge);
		
		
		
	}

}
