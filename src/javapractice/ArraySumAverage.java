package javapractice;

public class ArraySumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  /*
         * write a java program that calculates the average value of array elements
         *
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int input[]= {1,2,3,4,5,6};



        // 1) find sum of element

        double sum= 0;
        for(int each:input) {

            sum+=each;
        }

        // 2) calculate average

        double average = sum/input.length;

        // 3) print the result

        System.out.println("Average of elements in given array = " + average);
	}

}
