package javapractice;

import java.util.Scanner;

public class Average {

	public static void main(String args[]) {
		
		
		
		/*
		 Write a program in Java to input 5 numbers from keyboard and find their sum and average.
EXAMPLE:
	INPUT      :  
Input the 5 numbers :                                                            
1                                                                                
2                                                                                
3                                                                                
4                                                                                
5              
     OUTPUT : 
 
The sum of 5 no is : 15                                                          
The Average is : 3.0       
   */

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five numbers");
//		double num1 = scan.nextDouble();
//		double num2 = scan.nextDouble();
//		double num3 = scan.nextDouble();
//		double num4 = scan.nextDouble();
//		double num5 = scan.nextDouble();
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		int num5 = scan.nextInt();
		
		
		int sum = num1 + num2 + num3 + num4 + num5;
		double average = sum/5;
		System.out.println("The sum of five numbers is : "+ sum);
		System.out.println("The average is : "+ average);
		scan.close();
		
	}
}
