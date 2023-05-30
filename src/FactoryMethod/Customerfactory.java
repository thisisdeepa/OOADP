package FactoryMethod;

public class Customerfactory {
    public Customer createInstance(String type)
    {
        if(type.equalsIgnoreCase("regular"))
        {
            return new Regular();
        }
        else if(type.equalsIgnoreCase("senior"))
        {
            return new SeniorCitizen();
        }
        else
            return new FirstTime();
    }
}
