package Observer;

public class ObserverDemo {
    public static void main(String args[])
    {
        Subject obj=new FestiveSubject();
        Customer c1= new Customer("Ashiya");
        Customer c2= new Customer("Nitin");

        obj.subscribe(c1);
        obj.subscribe(c2);
        obj.festiveDiscount("Diwali",200);

        obj.unsubscribe(c1);
        obj.festiveDiscount("ugadi",500);

    }
}
