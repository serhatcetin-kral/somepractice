package javapractice;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
         * Write a method that accepts an array which has 3 elements
         * and returns a new array with 3 times more the length
         * where its first and last element is the
         * same as the original array, put middle number of original array into the
         * middle of your new array
         */

        int input[]= {1,2,3};
        System.out.println(Arrays.toString(longArray(input)));
    }

    public static int[] longArray(int input[]) {
        int longArray[]= new int[9];

        longArray[0]=input[0];
        longArray[4]=input[1];
        longArray[8]=input[2];



        return longArray;
		
		
		
		
		
		
		
		
	}

}
