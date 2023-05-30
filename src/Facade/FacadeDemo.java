package Facade;

public class FacadeDemo {
    public static void main(String args[])
    {
        SportsFacade sf=new SportsFacade(true,2000);
        sf.showItems();
        sf.ProcessCart();
    }
}
