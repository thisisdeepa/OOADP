package Bridge;

public class first extends Customer{
        first(Discount d)
        {
            super(d);
        }
        public double calculate(double amt)
        {
            return d.calc(amt);
        }
}
