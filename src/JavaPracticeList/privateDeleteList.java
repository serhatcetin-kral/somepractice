package JavaPracticeList;

import java.util.ArrayList;
import java.util.List;

public class privateDeleteList {

	/*
	 * * From the names in the list given as input
          * Write a program that deletes the letters 'a' in it
          *
          * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
          * OUTPUT : [Veli,Omer]
	 */
	
	
	
	public static void main(String[] args) {
		
		  List<String> list1 = new ArrayList<>();

	        list1.add("Ali");
	        list1.add("Veli");
	        list1.add("Ayse");
	        list1.add("Fatma");
	        list1.add("Omer");

	        List<String> list2 = new ArrayList<>();

	        for (String w : list1) {

	            if (w.toLowerCase().contains("a")) {
	                continue;
	            }else list2.add(w);
	        }
	        System.out.println(list2);
	    }
}	
	
	
		
	

