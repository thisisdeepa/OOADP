package Bridge;

public class regular extends Customer{

    regular(Discount d)
    {
        super(d);
    }
    public double calculate(double amt)
    {
        return d.calc(amt);
    }
}
