package javapractice;

import java.util.Arrays;

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Sorting numeric or String array */

        int[] myNums= { 89, 235 , 199 , 146, 201
                , 1458, 258, 125, 147} ;

        System.out.println("Before Sorting ;" +Arrays.toString(myNums));
        Arrays.sort(myNums);
        System.out.println("After Sorting ;" +Arrays.toString(myNums));

        String[] myString= { "Java", "C#", "Pyhton"} ;

        System.out.println("Before Sorting ;" +Arrays.toString(myString));
        Arrays.sort(myString);
        System.out.println("After Sorting ;" +Arrays.toString(myString));

		
		
	}

}
