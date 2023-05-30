package Bridge;

public class Discount1 implements Discount{
    public double calc(double amt){
        return 0.15*amt;
    }
}
