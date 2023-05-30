package FactoryMethod;

public class FactorymethodDemo {
    public static void main(String args[])
    {
            Customerfactory cf= new Customerfactory();
            Customer c1=cf.createInstance("regular");
            Customer c2=cf.createInstance("senior");
            c1.gettype();
            c2.gettype();
    }
}
