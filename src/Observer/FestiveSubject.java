package Observer;

import java.util.ArrayList;

public class FestiveSubject extends Subject{
    ArrayList<Customer> customer= new ArrayList<>();
    String currentFest;
    int currentDiscount;
    public void subscribe(Customer c){
        customer.add(c);
    }
    public void unsubscribe(Customer c){
        customer.remove(c);

    }
    public void festiveDiscount(String fes,int discount)
    {
        currentFest=fes;
        currentDiscount=discount;
        notifyall();
    }
    public void notifyall()
    {
        for(Customer c:customer)
            c.update(currentFest,currentDiscount);
    }

}
