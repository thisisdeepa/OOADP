package Strategy;

public class Context {
    PricingStrategy s;
    StoreLevelDiscount sd=new StoreLevelDiscount();
    Context(PricingStrategy s)
    {
        this.s=s;
    }
    public void calculate(double amt)
    {
        double midamt=amt-(s.calc(amt));
        double dis=sd.storeDiscount(amt);
        double finalamt=midamt-dis;
        System.out.println("Your final amount to be paid is: "+finalamt);
    }
}
