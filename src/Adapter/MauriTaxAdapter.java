package Adapter;

public class MauriTaxAdapter implements DecathlonTaxCalc{
    MauriTax mt=new MauriTax();
    public double taxCalculator(double amt){
        return mt.mauritax(amt);
    }
}
