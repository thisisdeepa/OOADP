package Singleton;
import java.util.ArrayList;
public class Browser {
    private static Browser instance;
    private ArrayList<String> history=new ArrayList<>();
    private Browser()
    {}
    public static Browser getInstance()
    {
        if(instance==null)
            instance=new Browser();
        else
            System.out.println("Instance already created");
        return instance;
    }
    public void add(String s)
    {
        history.add(s);
    }
    public void view()
    {
        for(String s:history)
            System.out.println(s);
    }
}
