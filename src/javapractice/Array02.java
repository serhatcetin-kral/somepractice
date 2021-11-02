package javapractice;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * Ask the user for an integer less than 100
           A method that returns to the user whether 
           it is in a predefined array or not. write
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: The number you entered is in the Array
         * Input : 15 Output: The number you entered is not in the Array
         *
         *
         */
        int array[]={3,5,21,32,34,45,56,57,76,87,95};

        inArray(array);

    }

    public static void inArray(int array[]) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number les than 100");
        int number=scan.nextInt();
        int flag=0;

        for (int i = 0; i < array.length; i++) {

            if (number==array[i]) {
                System.out.println("he number you entered is in the Array");
                flag++;
                break;
            }
        }  if (flag==0) {
            System.out.println("The number you entered is not in the Array");
        }

        scan.close();
	}

}
