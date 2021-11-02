package JavaPracticeList;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Write java code to get rid of multiple spaces from a string.
		String input = "I am  learning   Java. I liked  it     very much.";
		 String output=input.trim().replaceAll("\\s+", " ");
	        System.out.println("Output from the Shortest way\n" + output);
		
		
		
	}

}
