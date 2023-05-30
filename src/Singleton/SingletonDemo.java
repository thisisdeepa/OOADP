package Singleton;
import java.util.Scanner;
public class SingletonDemo {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String url=" ";
        Browser obj = Browser.getInstance();
        while(true)
        {
            System.out.println("Enter 1:Create instance  2:Add History   3:View History   4:Exit");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1: {
                    obj = Browser.getInstance();
                    break;
                }
                case 2: {
                    System.out.println("enter the url to be added");
                    url = sc.next();
                    obj.add(url);
                    break;
                }
                case 3: {
                    obj.view();
                    break;
                }
                case 4: {
                    System.exit(0);
                }
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
