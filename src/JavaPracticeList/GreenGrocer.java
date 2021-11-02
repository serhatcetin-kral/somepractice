package JavaPracticeList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreenGrocer {

	/*
	 * Write a simple grocery shopping program.
      *
      * Step 1: Select the product from the product list and ask how many kilos it is.
      * Step 2: Ask if you want to buy another product.
      * If he does not want, show the total amount, if he does, choose the product again.
      * Repeat this process until you want to end the shopping.
      * Step 3: Every time the customer selects a product, add the price of the product he bought to the total price.
      * Step 4 : Show the total amount to be paid when the shopping is over.
	 */
	  static List<String> productList  = new ArrayList<>();		/// ilk önce burayý oluþturalým.
	    static List<Float> productPrice  = new ArrayList<>();
	    static float totalAmount;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  productList.add("Tomatoes - Product code : 0");
	        productList.add("pepper - Product code : 1");
	        productList.add("plum - Product code : 2");
	        productList.add("watermelon - Product code : 3");
	        productList.add("crrot - Product code : 4");

	        productPrice.add(2.0f);
	        productPrice.add(3.0f);
	        productPrice.add(10.0f);
	        productPrice.add(5.0f);
	        productPrice.add(3.0f);

	        System.out.println(productList.toString());

	        askWhatCustomerWant();


	    }


	    private static void askWhatCustomerWant() {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Which product would you like to choose?");
	        int choose = scan.nextInt();
	        System.out.println("How much weight do you want to gain?");
	        float kilo = scan.nextFloat();
	        float totalPprice = productPrice.get(choose);

	        float totalPrice = kilo * totalPprice;
	        totalAmount += totalPrice;

	        System.out.println("Seçtiginiz ürün : " +productList.get(choose));
	        System.out.println("Ürünün Fiyati : "   +totalPrice);

	        System.out.println("Type 1 if you want to continue shopping, or 2 if you want to go to the cash register. : ");
	        int karar = scan.nextInt();
	        if(karar == 1)
	            askWhatCustomerWant();
	        else
	            kasayaGit();


	    }


	    private static void kasayaGit() {
	        System.out.println("Toplam ödenecek tutar : " + totalAmount);

	    }

	}