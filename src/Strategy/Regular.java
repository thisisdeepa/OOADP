package Strategy;

public class Regular extends PricingStrategy{
    public double calc(double amt){
        return 0.12*amt;
    }
}
