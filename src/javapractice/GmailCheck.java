package javapractice;

import java.util.Scanner;

public class GmailCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 ** Ask the user to enter an email,
          *
          * If it does not contain the @ sign, print "enter a valid email"
          *
          * If it says "gmail.com" or "hotmail.com" after the @ sign, print "email confirmed"
          *
          * If it says something other than “gmail.com” or “hotmail.com” after the @ sign, “Please email
          * enter your account"
          *
          * SAMPLE:
          *
          * INPUT : techproed.com OUTPUT : “enter a valid email”
          * INPUT : techproed@gmail.com OUTPUT : “email confirmed”
          * INPUT : techproed@yahoo.com OUTPUT : “Please enter your gmail account
		 */
		Scanner scan=new Scanner(System.in);
        System.out.println("please enter email: ");
        String mail=scan.next();
        int no=mail.indexOf("@");

        if (!mail.contains("@")) {
            System.out.println("please enter valid email");
        }else {

            if (mail.substring(no+1).equals("gmail.com") || mail.substring(no+1).equals("hotmail.com") ) {
                System.out.println("email confirmed");

            }else {
                System.out.println("please enter a valid email address");
            }


            scan.close();
	}

}
}