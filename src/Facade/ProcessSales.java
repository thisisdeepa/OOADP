package Facade;

import java.util.Scanner;

public class ProcessSales {
    Scanner sc= new Scanner(System.in);
    boolean gift;
    int amt;
    int qty;
    ProcessSales(boolean gift,int amt,int qty)
    {
        this.gift=gift;
        this.amt=amt;
        this.qty=qty;
    }
    public void processOrder()
    {
        if(!gift)
            System.out.println("No gift cards...Please pay: Rs."+amt);
        else
        {
            System.out.println("Enter the gift voucher amount");
            int giftval=sc.nextInt();
            if(qty>1)
                System.out.println("More than 1 item cannot be purchased, You need to pay: Rs."+amt);
            else if(giftval>amt)
                System.out.println("Voucher used...No extra amount is refunded");
            else if(giftval<amt)
                System.out.println("You need to pay extra amout of Rs."+(amt-giftval));
        }


    }
}
