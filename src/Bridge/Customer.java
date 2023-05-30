package Bridge;

public abstract class Customer {
    Discount d;
    Customer(Discount d)
    {
        this.d=d;
    }
    public abstract double calculate(double amt);

}
