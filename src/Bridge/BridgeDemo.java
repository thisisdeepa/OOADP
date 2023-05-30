package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Customer c=new regular(new Discount1());
        System.out.println("Your initial amount: Rs."+2000+" after discount: Rs."+(2000-c.calculate(2000)));
        c=new first(new Discount2());
        System.out.println("Your initial amount: Rs."+2000+" after discount: Rs."+(2000-c.calculate(2000)));
    }
}
