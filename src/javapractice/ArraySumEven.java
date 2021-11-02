package javapractice;

public class ArraySumEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Write a method that sums even numbers in the entered Multidimensional array
		*/

		
		/*INPUT : {{1,3,6},{2,8},{5,7,9,14}}
        *
        * OUTPUT :sum of even numbers in array : 26
        *
        *
        */

       int array[][]={{1,3,6},{2,8},{5,7,9,14}};
       evenNumbers(array);
   }


   public static void evenNumbers(int array[][]) {

       int sum=0;

       for (int i = 0; i < array.length; i++) {

           for (int j = 0; j < array[i].length; j++) {

               if (array[i][j]%2==0) {
                   sum+=array[i][j];
               }


           }

       } System.out.println("sum of even numbers= " + sum);
		
		
		
		
		
		
	}

}
