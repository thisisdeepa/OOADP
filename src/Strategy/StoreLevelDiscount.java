package Strategy;

public class StoreLevelDiscount {
    double discount=0;
    public double storeDiscount(double amt)
    {
        if (amt>2000)
            discount=100.0;
        return discount;
    }

}
