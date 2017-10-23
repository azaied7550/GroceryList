package com.company;



import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<GroceryItems> GroceryItems;

    public ShoppingCart()
    {
        GroceryItems = new ArrayList<GroceryItems>();

    }

    public void addGroceryItems(GroceryItems toAdd)
    {
        this.GroceryItems.add(toAdd);
    }

    public double getTotal()
    {
        double totalPrice = 0;
        for(GroceryItems g: GroceryItems)
        {
            totalPrice+=g.getPrice();
        }

        return totalPrice;
    }

    public String displayItems()
    {
        String toDisplay="";

        for(GroceryItems g: GroceryItems)
        {
            toDisplay+=g.getName()+"                "+g.getPrice()+"\n";
        }

        return toDisplay;

    }
}