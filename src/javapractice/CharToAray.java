package javapractice;

import java.util.Arrays;

public class CharToAray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         */

        String input="John";
        charArray(input);


    }
    public static void charArray(String input) {

        char output[]=new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            output[i]=input.charAt(i);
        }


        System.out.println(Arrays.toString(output));
	}

}
