package Facade;

import java.util.HashMap;
import java.util.Scanner;

public class ItemsPurchased {
    HashMap<String,Integer> hm = new HashMap<>();
    String name;
    int qty;
    int n;
    Scanner sc = new Scanner(System.in);
    ItemsPurchased()
    {
        storePurchase();
    }
    public void storePurchase()
    {
        System.out.println("enter the number of items");
        n= sc.nextInt();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the item name");
            name = sc.next();
            System.out.println("Enter the quantity");
            qty = sc.nextInt();
            hm.put(name,qty);
        }

    }
    public void displayItems()
    {
        hm.forEach((name,qty)-> System.out.println("Item Name: "+name+"  Quantity: "+qty));
    }
    public int getCount()
    {
        return n;
    }
}
