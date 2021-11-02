package JavaPracticeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListBasic {

	public static void main(String[] args) {
		/*
        create a string list which has five element and do the following:
         *
         * Names: {Jim,Jack,Tom,Lee,Pam}
         *
         * -) Add Lucy instead of Jim.
         * -) Add the 3rd index to the Basic.
         * -) Remove Jack from the list.
         * -) Add Gregor to the list.
         * -) Find the size of the list.
         * -) Put in alphabetical order,
         * -) Delete all the elements of the list.
        */

		
		
		List<String> list=new ArrayList<>();
		list.add("Jim");
		list.add("Jack");
		list.add("Tom");
		list.add("Lee");
		list.add("Pam");
		list.add("ali");
		  
		  System.out.println("list="+list);
		list.remove("Jim");
		list.add(0,"lucy");
		  list.add("serhat");
		  System.out.println("after change list="+list);
			
			System.out.println("size of list "+list.size()); 
			Collections.sort(list);
			System.out.println("after change list="+list);
			list.removeAll(list);
			System.out.println("after change last one="+list);
}	
	
	
		
	
}