package javapractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your string");
		
		String str=scan.nextLine();
		
//		//StringBuilder str1=new StringBuilder();
//		
//		//System.out.println(str1.append(str).reverse());
//		
//		StringBuilder str1=new StringBuilder(str);
//		
//		System.out.println(str1.reverse());
		
		
		//////////////
		//2.way
		String rev="";
		for(int i=str.length()-1;i>=0;--i) {
			
			rev=rev+str.charAt(i);
			
		}
		System.out.println("reverse string="+rev);

		
		
		
		
		
	}

}
