package Strategy;

public class FirstTime extends PricingStrategy{
    public double calc(double amt){
        return 0.15*amt;
    }
}
