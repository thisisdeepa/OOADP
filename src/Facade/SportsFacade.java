package Facade;

public class SportsFacade {

    ItemsPurchased i;
    ProcessSales p;
    SportsFacade(boolean gift, int amt)
    {
        i= new ItemsPurchased();
        p=new ProcessSales(gift,amt,i.getCount());
    }
    public void showItems()
    {
        i.displayItems();
    }
    public void ProcessCart()
    {
        p.processOrder();
    }
}
