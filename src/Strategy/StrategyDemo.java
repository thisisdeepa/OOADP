package Strategy;

public class StrategyDemo {
    public static void main(String args[])
    {
        Context c=new Context(new FirstTime());
        c.calculate(2000.00);
    }
}
