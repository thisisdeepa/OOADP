package Observer;

public class Customer implements Observer{
    String name;
    Customer(String name)
    {
        this.name=name;
    }
    public void update(String fest,int discount){
        System.out.println("Customer name: "+name+"....You have a discount of Rs."+discount+"  for the festival: "+fest);
    }

}
