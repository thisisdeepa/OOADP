package Strategy;

public class Senior extends PricingStrategy{
    public double calc(double amt){
        return 0.18*amt;
    }
}
