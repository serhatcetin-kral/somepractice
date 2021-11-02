package javapractice;

import java.util.Scanner;

public class Swap_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 0)Ask user to enter two integers 
		 1)Swap the integers
		 2)EXAMPLE:
		   INPUT: a= 3
		          b= 5
		   OUTPUT: a= 5
		           b= 3
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the first number");
		
		int a=scan.nextInt();
		
		System.out.println("please enter the second number");
		
		int b=scan.nextInt();
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
		//System.out.println("a="+a+" b="+b);
		
		//2.way
		int temp=0;
		temp=a;
		System.out.println("a="+a+" "+temp+" b="+b);
		
		a=b;
		//System.out.println(a+" "+temp+" "+b);
		b=temp;
		System.out.println("a ="+a+" "+temp+" b="+b);
		
		
		
		
		
		
	}

}
