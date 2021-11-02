package javapractice;

import java.util.Scanner;

public class ShopingIfElse {

	public static void main(String[] args) {

		/*
         * QUESTION 4
         *
         * Get the number and list price of the product purchased from the user,
         * ask the user if they have a customer card
         *
         * If you have a customer card, get 20% off if you buy more than or equal to 10 products, and 15% off if you don't.
         * If the customer does not have a card, 15% off if he buys more than or qqual to 10 products, 10% off if he does not
         *
         */
		Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount of product");
        int quantity = scan.nextInt();
        System.out.println("Enter the product list price");
        double price = scan.nextDouble();
        System.out.println("Do you have a customer card 1:Yes 2:No");
        int card=scan.nextInt();



        //1.yol
		
		if(card==1 && quantity>=10) {
			System.out.println("20% off total price = " + quantity*price*.80 );
		} else if (card==1 && quantity<10) {
			System.out.println("%15 off total price = " + quantity*price*.85 );
		} else if (card==2 && quantity>=10) {
			System.out.println("%15 off total price = " + quantity*price*.85 );
		} else if (card==2 && quantity<10) {
			System.out.println("%10 off total price = " + quantity*price*.90 );
		} else System.out.println("Please enter one of the options offered to you.");
		

        // 2.yol

//        if(card==1) {
//            if(quantity>10) {
//                System.out.println("%20 Indirimli toplam fiyat = " + quantity*price*.80 );
//            } else {
//                System.out.println("%15 Indirimli toplam fiyat = " + quantity*price*.85 );
//            }
//
//        } else if(card==2) {
//            if(quantity>10 ) {
//                System.out.println("%15 Indirimli toplam fiyat = " + quantity*price*.85 );
//            }else {
//                System.out.println("%15 Indirimli toplam fiyat = " + quantity*price*.90 );
//            }
//
//        } else System.out.println("Lutfen size soylenen seceneklerden birini giriniz");
//
//        scan.close();
	}

}
