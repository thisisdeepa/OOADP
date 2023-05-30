package Observer;

public abstract class Subject {
    public abstract void subscribe(Customer c);
    public abstract void unsubscribe(Customer c);
    public abstract void festiveDiscount(String fes,int discount);
}
