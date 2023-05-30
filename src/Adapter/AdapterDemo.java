package Adapter;

public class AdapterDemo {
    public static void main(String args[])
    {
        DecathlonTaxCalc dc= new MauriTaxAdapter();
        System.out.println("The Amount is: 2000");
        System.out.println("After applying mauri tax: "+dc.taxCalculator(2000.00));
    }
}
