package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String entered="y";
        String item="";
        double price=0;
        Scanner keyboard = new Scanner(System.in);

        ShoppingCart thisCart = new ShoppingCart();


                do{
            System.out.print("Enter an item to add to your grocery list:");
            item = keyboard.nextLine();

            System.out.print("Enter a price for your grocery item:");
            price = keyboard.nextDouble();
            keyboard.nextLine();

            GroceryItems thisItem = new GroceryItems(item,price);
            thisCart.addGroceryItems(thisItem);

            System.out.print("Do you want to continue?");
            entered = keyboard.nextLine();

        }while(entered.equalsIgnoreCase("y")||!entered.equalsIgnoreCase("n"));


        System.out.println(thisCart.displayItems());
        System.out.println("The total price is: "+thisCart.getTotal());
    }
}
