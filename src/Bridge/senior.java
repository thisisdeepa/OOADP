package Bridge;

public class senior extends Customer{
    senior(Discount d)
    {
        super(d);
    }
    public double calculate(double amt)
    {
        return d.calc(amt);
    }
}
